package qwe;

abstract public class inher {
	class ParentClass {
		public void parentMethod() {

				System.out.println("parent method called");
			}
		}
	class ChildClass extends ParentClass {
			public void childMethod() {
				System.out.println("child method called");
			}
		}
		class GrandChildClass extends ChildClass{
			public void grandChildMethod() {
				System.out.println("grand child called");
			}
		}
		public class InheitanceDemo {
			public static void main(String[] args) {
				ChildClass c = new ChildClass();
				c.parentMethod();
				c.childMethod();
				GrandChildClass g = new GrandChildClass();
				g.parentMethod();
				g.childMethod();
				g.grandChildMethod();
			}
		}

}