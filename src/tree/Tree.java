package tree;

public interface Tree <D extends Comparable>{
	
public boolean is_empty();
public int cardinality();
public boolean member(D element);
public NonEmptyBST<D> add(D element);

}
