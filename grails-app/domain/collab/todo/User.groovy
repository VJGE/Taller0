package collab.todo

class User {
	
	String userName
	String firstName
	String lastName
	
	static hasMany = [todos: Todo,categorys:Category]
	
    static constraints = {
		userName(blank:false,unique:true)
    }
}
