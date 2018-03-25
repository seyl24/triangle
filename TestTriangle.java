package triangle;


	import static org.junit.Assert.*;


	import org.junit.Before;
	import org.junit.Test;

	public class TestTriangle {

		private Triangle tri;
		@Before
		public void setUp() throws Exception {
			tri=new Triangle(2,2,3);
		}

		@Test
		public void testIsEquilatera() {
			assertFalse(tri.isEquilatera());
		}
		
		@Test
		public void testIsIsosceles() {
			assertTrue(tri.isIsosceles());
		}

		
		@Test
		public void testIsScalene() {
			assertTrue(tri.isScalene());
		}
	}

