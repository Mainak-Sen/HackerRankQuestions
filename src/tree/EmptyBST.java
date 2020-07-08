package tree;

public class EmptyBST<D extends Comparable> implements Tree<D>{

	public EmptyBST() {
	
	}
	@Override
	public boolean is_empty() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int cardinality() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean member(D element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public NonEmptyBST<D> add(D element) {
		// TODO Auto-generated method stub
		return new NonEmptyBST<D>(element);
	}

}
