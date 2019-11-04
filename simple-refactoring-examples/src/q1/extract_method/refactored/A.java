package q1.extract_method.refactored;

import java.util.List;

class Graph {
	 String name;
	 boolean contains( String p ) {
		 return name.contains(p);
	 }
}

class Node extends Graph{ }
class Edge extends Graph{ }

public class A {
   Node m1(List<Node> nodes, String p) {
	      extractedMethod( nodes, p );
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      extractedMethod( edgeList, p );
      return null;
   }

   // TODO: Your answer
   <T extends Graph> void extractedMethod(List<T> nodeList, String p) {
	   for ( T node : nodeList ) {
		   if( node.contains(p))
			   System.out.println(node);
	   }
   }
}