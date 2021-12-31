package basics._01Abstract;

/**
 *	ABSTRACT:
 *	-----------
 *	-abstract means concentrate on essential thing and not on everything.
 *	-in order to get expertizsation we use abstract.
 *	-while designing a class, a class can have diversive information and there if only one person
 *	 is designing that class, he would not be in a position to provide that quality as team of expertise
 *	 in corresponding field can provide.
 *	-because one developer can't be expert on all fields.
 *	-so by using abstract he would choose only knowing areas leaving unknown areas as blank or abstract.
 *	-abstract means incomplete or unimplemented.
 *  -for abstract class we can create objects.
 *  -if minimum one member of the class is abstract then it is mandatory to declare that class abstract.
 *  -we can keep implemented members inside a class then naming that class as an abstract is optional.
 *  -for restricting on usage of non static members we declare as abstract because that can't be instantiated.
 *  -compiler generates .class file for abstract class. 
 *  
 *  ----------------------------------------------------
 *  ABSTRACT CLASS IS NOT 100% ABSTRACT
 *  
 *  -in an abstract class we can keep n numbers of def block.
 *  -constructor is one of the definition block, if we dont keep
 *   then compiler will keep by default of no arg.
 *  -if we keep a constructor then we can't create an object for the current abstract class
 *   so constructor will not execute.
 *  -so we will make subclass and it would be concrete, so sub class constructor will call to super
 *   class which abstract containing one constructor by creating an object to subclass.
 *  -constructor executes:
 *  	-when we create an object to current class.
 *  	-when we create an object to subclass under constructor chain
 */
