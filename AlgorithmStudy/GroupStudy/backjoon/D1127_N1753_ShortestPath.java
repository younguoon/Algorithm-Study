/*
문제
방향그래프가 주어지면 주어진 시작점에서 다른 모든 정점으로의 최단 경로를 구하는 프로그램을 작성하시오. 단, 모든 간선의 가중치는 10 이하의 자연수이다.

입력
첫째 줄에 정점의 개수 V와 간선의 개수 E가 주어진다. (1≤V≤20,000, 1≤E≤300,000) 모든 정점에는 1부터 V까지 번호가 매겨져 있다고 가정한다. 
둘째 줄에는 시작 정점의 번호 K(1≤K≤V)가 주어진다. 
셋째 줄부터 E개의 줄에 걸쳐 각 간선을 나타내는 세 개의 정수 (u, v, w)가 순서대로 주어진다. 
이는 u에서 v로 가는 가중치 w인 간선이 존재한다는 뜻이다. u와 v는 서로 다르며 w는 10 이하의 자연수이다. 
서로 다른 두 정점 사이에 여러 개의 간선이 존재할 수도 있음에 유의한다.

출력
첫째 줄부터 V개의 줄에 걸쳐, i번째 줄에 i번 정점으로의 최단 경로의 경로값을 출력한다. 시작점 자신은 0으로 출력하고, 경로가 존재하지 않는 경우에는 INF를 출력하면 된다.

예제 입력
5 6
1
5 1 1
1 2 2
1 3 3
2 3 4
2 4 5
3 4 6

예제 출력 
0
2
3
7
INF
*/

package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class D1127_N1753_ShortestPath
{
	public static final int INFINITE = 3000000;
	public static final String STR_INFINIT = "INF";
	private int v, e, k;

	public D1127_N1753_ShortestPath()
	{
		try
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			String[] temps = reader.readLine().split(" ");
			v = Integer.parseInt(temps[0]);
			e = Integer.parseInt(temps[1]);
			k = Integer.parseInt(reader.readLine()) - 1;
			List<List<Edge>> adjacencyList = new ArrayList<>();
			
			for(int i = 0; i < v; i++)
			{
				List<Edge> edges = new ArrayList<>();
				adjacencyList.add(edges);
			}
			
			for(int i = 0; i < e; i++)
			{
				temps = reader.readLine().split(" ");
				int from = Integer.parseInt(temps[0]) - 1;
				int to = Integer.parseInt(temps[1]) - 1;
				int weight = Integer.parseInt(temps[2]);
				adjacencyList.get(from).add(new Edge(from, to, weight));
			}
			reader.close();
			int[] result = dikstra(adjacencyList, k);

			for(int i = 0; i < v; i++)
			{
				if(result[i] != INFINITE)
				{
					System.out.println(result[i]);
				}
				else
				{
					System.out.println(STR_INFINIT);
				}
			}
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
		}
		return;
	}

	private int[] dikstra(List<List<Edge>> adjacencyList, int start)
	{
		PriorityQueue<Edge> queue = new PriorityQueue<>();
		
		//해당 엣지를 방문했는지 여부 체크
		boolean[] isVisit = new boolean[v];
		
		//해당 노드까지의 최단 거리를 저장하는 배열
		int[] distance = new int[v];

		//거리 초기화
		for(int i = 0; i < v; i++)
		{
			distance[i] = INFINITE;
		}
		distance[start] = 0;
		
		//offer메소드, PriorityQueue에 insert
		queue.offer(new Edge(start, -1, distance[start]));
		
		while(!queue.isEmpty())
		{
			//poll메소드,  head를 삭제하거나, queue가 비었으면 null을 리턴 
			Edge pos = queue.poll();
			List<Edge> edges = adjacencyList.get(pos.from);
			isVisit[pos.from] = true;
			
			for(Edge edge : edges)
			{
				if(!isVisit[edge.to])
				{
					if(distance[edge.to] > distance[pos.from] + edge.weight)
					{
						distance[edge.to] = distance[pos.from] + edge.weight;
						queue.offer(new Edge(edge.to, -1, distance[edge.to]));
					}
				}
			}
		}
		return distance;
	}

	public static void main(String[] args)
	{
		new D1127_N1753_ShortestPath();
	}

	public class Edge implements Comparable<Edge>
	{
		public int from;
		public int to;
		public int weight;

		public Edge(int from, int to, int weight)
		{
			this.from = from;
			this.to = to;
			this.weight = weight;
		}

		@Override
		public int compareTo(Edge o)
		{
			return weight - o.weight;
		}
	}
}
