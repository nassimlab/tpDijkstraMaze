
public class Dijkstra {
	
	private PreviousInterface dijkstra(GraphInterface g, VertexInterface r, ASetInterface a, PiInterface pi, PreviousInterface previous) {
		a.addTo(r);
		VertexInterface pivot = r;
		pi.setpi(r, 0);
		for(VertexInterface x : g.getVertexList()) {
			if(x.IsDifferentFrom(r)) {
				pi.setpi(x, -1);
			}
		}
		int n = g.getVertexList().size();
		for(int j = 1; j < n; j++) {
			for(VertexInterface y : g.getSuccessorsList(pivot)) {
				if(!a.isIn(y)) {
					if(pi.pi(pivot) + pi.getp(pivot, y) < pi.pi(y)) {
						pi.setpi(y, pi.pi(pivot)+pi.getp(pivot, y));
						previous.setPrevious(y,pivot);
		
					}
				}
			}
			VertexInterface mini = null;
			for(VertexInterface y : g.getVertexList()) {
				if(!a.isIn(y)) {
					if(mini==null) {
						mini=y;
					} else {
						if(pi.pi(y)<pi.pi(mini)) {
							mini=y;
						}
					}
					
				}
			}
			pivot=mini;
			a.addTo(pivot);
			}
		return previous;
	}
}

