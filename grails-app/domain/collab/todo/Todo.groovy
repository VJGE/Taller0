package collab.todo

class Todo {
	
	User owner
	String name
	String note
	String priority
	String status
	Date createdDate
	Date dueDate
	Date completedDate
	
    static constraints = {
    }
}
