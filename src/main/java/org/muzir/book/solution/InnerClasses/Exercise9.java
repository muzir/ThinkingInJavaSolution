package org.muzir.book.solution.InnerClasses;

/**
 * @author muzir
 *
 */
class Table {
	public Shape createShape() {
		class TableType implements Shape {
			String _type;

			public TableType(String type) {
				_type = type;
			}

			@Override
			public String getType() {
				return _type;
			}
		}
		Shape shape = new TableType("Circle");
		return shape;
	}
}

/**
 * @author muzir
 *
 */
public class Exercise9 {

	public static void main(String[] args) {
		Table table = new Table();
		System.out.println(table.createShape().getType());
	}

}
