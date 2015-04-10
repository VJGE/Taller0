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
		name(blank:false)
		createdDate()
		priority()
		status()
		note(maxSize:1000,nullable:true)
		completedDate(nullable:true)
		dueDate(nullable:true)
    }
	String toString(){
		name
	}
}
