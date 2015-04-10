package collab.todo

class Todo {
	
	String name
	String note
	String priority
	String status
	Date createdDate
	Date dueDate
	Date completedDate
	
	User owner
	Category category
	static belongsTo = [User, Category]
	
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
