package Exercise;


class node{
	Employee emp;
	node next;
	node(Employee emp,node next){
		this.emp=emp;
		this.next=next;
	}
	
}
public class Employee {
	int employeeId;
	String employeeName;
	Employee(int employeeId,String employeeName){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
	}
	@Override
	public String toString() {
		return employeeId + employeeName ;
	}
	
}
class LinkedList {
node ROOT;
public void add(Employee emp) {
     node newNode = new node(emp,null);
     if (ROOT == null) {
         ROOT = newNode;
     } else {
         node temp = ROOT;
         while (temp.next != null) {
             temp = temp.next;
         }
         temp.next = newNode;
     }
}
 
// Method to print the linked list
public void printList() {
     node temp = ROOT;
     while (temp != null) {
         System.out.print(temp.emp + " ");
         temp = temp.next;
     }
     System.out.println();
}

	public void sortByEmpid() {
		
		if (ROOT == null || ROOT.next == null) {
		         return;
		     }
		 
		     boolean swapped;
		     do {
		         swapped = false;
		         node current = ROOT;
		         node prev = null;
		         while (current != null && current.next != null) {
		             if (current.emp.employeeId > current.next.emp.employeeId) {
		                 Employee temp = current.emp;
		                 current.emp = current.next.emp;
		                 current.next.emp = temp;
		 
		                 swapped = true;
		             }
		             current = current.next;
		         }
		     } while (swapped);  
		}
public void sortByEmpname() {
	//emp.employeeName.subString(0,1);
		
		if (ROOT == null || ROOT.next == null) {
		         return;
		     }
		 
		     boolean swapped;
		     do {
		         swapped = false;
		         node current = ROOT;
		         node prev = null;
		         while (current != null && current.next != null) {
		             if (current.emp.employeeId > current.next.emp.employeeId) {
		                 Employee temp = current.emp;
		                 current.emp = current.next.emp;
		                 current.next.emp = temp;
		 
		                 swapped = true;
		             }
		             current = current.next;
		         }
		     } while (swapped);  
		}
	
		
		
public static void main(String args[]) {
	LinkedList list=new LinkedList();
	list.add(new Employee(101,"abc"));
	list.add(new Employee(103,"bca"));
	list.add(new Employee(106,"cba"));
	list.add(new Employee(102,"xyz"));
	list.sortByEmpid();
	list.printList();
	
	
}
	
}
	


