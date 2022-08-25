
public class BoxGenerics<T, K> {

	private T length;
	private T width;
	private T height;
	private K color;
	
	public BoxGenerics(T length, T width, T height, K color) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public T getLength() {
		return length;
	}

	public void setLength(T length) {
		this.length = length;
	}

	public T getWidth() {
		return width;
	}

	public void setWidth(T width) {
		this.width = width;
	}

	public T getHeight() {
		return height;
	}

	public void setHeight(T height) {
		this.height = height;
	}

	public K getColor() {
		return color;
	}

	public void setColor(K color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "BoxGenerics [length=" + length + ", width=" + width + ", height=" + height + ", color=" + color + "]";
	}
	
	
}
