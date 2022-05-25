class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>(true);
        graph.addEdge("1", "2", 2);
        graph.addEdge("1", "3", 7);
        graph.addEdge("2", "4", 3);
        graph.addEdge("3", "2", 3);
        graph.addEdge("3", "4", 4);
        graph.addEdge("3", "5", 5);

        System.out.print("Dijkstra: ");
        Search<String> dijkstraSearch = new DijkstraSearch<>(graph, "1");
        System.out.println(dijkstraSearch.output("5"));

        System.out.print("Breadth: ");
        Search<String> breadthFirstSearch = new BreadthFirstSearch<>(graph, "1");
        System.out.println(breadthFirstSearch.output("5"));
    }
}