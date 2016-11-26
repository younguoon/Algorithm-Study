/*
����
����׷����� �־����� �־��� ���������� �ٸ� ��� ���������� �ִ� ��θ� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, ��� ������ ����ġ�� 10 ������ �ڿ����̴�.

�Է�
ù° �ٿ� ������ ���� V�� ������ ���� E�� �־�����. (1��V��20,000, 1��E��300,000) ��� �������� 1���� V���� ��ȣ�� �Ű��� �ִٰ� �����Ѵ�. 
��° �ٿ��� ���� ������ ��ȣ K(1��K��V)�� �־�����. 
��° �ٺ��� E���� �ٿ� ���� �� ������ ��Ÿ���� �� ���� ���� (u, v, w)�� ������� �־�����. 
�̴� u���� v�� ���� ����ġ w�� ������ �����Ѵٴ� ���̴�. u�� v�� ���� �ٸ��� w�� 10 ������ �ڿ����̴�. 
���� �ٸ� �� ���� ���̿� ���� ���� ������ ������ ���� ������ �����Ѵ�.

���
ù° �ٺ��� V���� �ٿ� ����, i��° �ٿ� i�� ���������� �ִ� ����� ��ΰ��� ����Ѵ�. ������ �ڽ��� 0���� ����ϰ�, ��ΰ� �������� �ʴ� ��쿡�� INF�� ����ϸ� �ȴ�.

���� �Է�
5 6
1
5 1 1
1 2 2
1 3 3
2 3 4
2 4 5
3 4 6

���� ��� 
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
	//�Ѱ�
	public static final int INFINITE = 3000000;
	//��ΰ� �������� �ʴ� ���
	public static final String STR_INFINIT = "INF";

	private int v, e, k;

	public D1127_N1753_ShortestPath()
	{
		try
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			String[] temps = reader.readLine().split(" ");
			v = Integer.parseInt(temps[0]);
//			System.out.println("v�� �Է¿Ϸ�");
			e = Integer.parseInt(temps[1]);
//			System.out.println("e�� �Է¿Ϸ�");
			//�� -1�� ������??
			k = Integer.parseInt(reader.readLine()) - 1;
			
//			System.out.println("k������ �Է� �Ϸ�");
			
//			System.out.println("for�� ����");
			List<List<Edge>> adjacencyList = new ArrayList<>();
			for(int i = 0; i < v; i++)
			{
//				System.out.println("List<List<Edge>> for������ �Է¹���");
				List<Edge> edges = new ArrayList<>();
				adjacencyList.add(edges);
//				System.out.println("adjacencyList : " + adjacencyList );
//				System.out.println("edges : " + edges);
			}
//			System.out.println("for�� ����");
			
			
			for(int i = 0; i < e; i++)
			{
				temps = reader.readLine().split(" ");
				int from = Integer.parseInt(temps[0]) - 1;
//				System.out.println("from : " + from);
				int to = Integer.parseInt(temps[1]) - 1;
//				System.out.println("to : "+to);
				int weight = Integer.parseInt(temps[2]);
//				System.out.println("weight : "+weight);
				adjacencyList.get(from).add(new Edge(from, to, weight));
//				System.out.println(adjacencyList.get(from).add(new Edge(from, to, weight)));
//				System.out.println("adjacencyList"+adjacencyList);
			}
			reader.close();
			
			int[] result = dikstra(adjacencyList, k);
			for(int i = 0; i < v; i++)
			{
//				System.out.println("result[i] : "+ result[i]);
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
		boolean[] isVisit = new boolean[v];
		int[] distance = new int[v];

		for(int i = 0; i < v; i++)
		{
			distance[i] = INFINITE;
//			System.out.println("distance[" + i + "] = " + distance[i]);
		}
		distance[start] = 0;
		
		queue.offer(new Edge(start, -1, distance[start]));
//		System.out.println("queue.offer(new Edge(start, -1, distance[start])) : "+queue.offer(new Edge(start, -1, distance[start])));
		while(!queue.isEmpty())
		{
			Edge pos = queue.poll();
			List<Edge> edges = adjacencyList.get(pos.from);
			isVisit[pos.from] = true;
//			System.out.println("edges : " + edges);
//			System.out.println("pos : "+pos);
			
			for(Edge edge : edges)
			{
//				System.out.println("edges : "+edges);
				if(!isVisit[edge.to])
				{
					System.out.println("----");
					System.out.println("isVisit : "+isVisit);
					System.out.println("isVisit[edge] : "+isVisit[edge.to]);
					System.out.println("----");
					if(distance[edge.to] > distance[pos.from] + edge.weight)
					{
						
						System.out.println("before : "+distance[edge.to]+distance[pos.from]+edge.weight);
						distance[edge.to] = distance[pos.from] + edge.weight;
						System.out.println("after : "+distance[edge.to]);
						queue.offer(new Edge(edge.to, -1, distance[edge.to]));
						System.out.println("----");
					}
					else{
						System.out.println("nothing");
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
			System.out.println("o.weight : " + o.weight);
			return weight - o.weight;
		}
	}
}
