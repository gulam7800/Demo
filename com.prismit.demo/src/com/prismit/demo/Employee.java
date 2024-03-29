package com.prismit.demo;

import java.io.Serializable;

public class Employee implements Serializable{
	private int id;
	private String name;
	private int saary;

	public Employee(int id, String name, int saary) {
		super();
		this.id = id;
		this.name = name;
		this.saary = saary;
	}

	
	  @Override 
	  public int hashCode() {
		  final int prime = 31;
		  int result = 1;
		  result = prime * result + id; 
		  result = prime * result + ((name == null) ? 0 :
			  name.hashCode()); result = prime * result + saary; return result;
	  
	 }
	 
	/*
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Employee other = (Employee) obj; if (id != other.id) return false; if
	 * (name == null) { if (other.name != null) return false; } else if
	 * (!name.equals(other.name)) return false; if (saary != other.saary) return
	 * false; return true; }
	 */

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", saary=" + saary + "]";
	}

}
