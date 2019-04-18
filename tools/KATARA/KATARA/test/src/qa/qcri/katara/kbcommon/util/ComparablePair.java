package qa.qcri.katara.kbcommon.util;

import java.io.Serializable;

public class ComparablePair<K extends Comparable, V> implements Serializable, Comparable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6936122995730996437L;
	
	public K key;
	public V value;

	public ComparablePair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (key == null)
		{
			if (other.key != null)
				return false;
		}
		else if (!key.equals(other.key))
			return false;
		if (value == null)
		{
			if (other.value != null)
				return false;
		}
		else if (!value.equals(other.value))
			return false;
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public int compareTo(Object o) {
		if (o instanceof Pair<?, ?>) {
			ComparablePair<?, ?> oPair = (ComparablePair<?,?>)o;
			return this.key.compareTo(oPair.key);
		}
		return 0;
	}

	
}
