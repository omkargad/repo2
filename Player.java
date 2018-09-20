package pojo;

public class Player {
		private Integer age;
		private String name;
		private String sex;
		
		
		 public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		Player(String name,Integer age,String sex)
		 {
			 this.name=name;
			 this.age=age;
			 this.sex=sex;
		 }
		
		public void kick(){
			System.out.println("kick");
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
}
