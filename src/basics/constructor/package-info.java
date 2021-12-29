package basics.constructor;

/**
*		##################################
		#           CONSTRUCTORS		 #
		##################################	
*
*
*
*	--	It has same name as class name.
*	-- 	One def block {}
*	--	This class doesn't have return type.
*	--	It is automatically loaded whenever an object is created.
*	--	Object creation statement requires a corresponding constructor i.e. we need to 
*		specify  the available constructor.
*	--	It is used to initialise non-static members.
*
*
*	##################################
	#   CONSTRUCTORS GROUND-RULES    #
	##################################
	
	1.	It will check weather compiler had provided all mandatory or missed files in .class file not in .java file
	
	2.	For interacting with database we need some statements and these statements are kept in constructor like
		mainframe, db, SAP, oracle etc.
		
	3.	For one class there must be minimum one constructor.
	
	4.	If we don't keep one constructor then compiler automatically provide a default constructor. That should 
		be of no args.
	
	5.	Without constructor, we can't create an object.
	
	6.	For one constructor, we can create 'n' number of object.
	
	7.	In constructor we can keep 'n' number of executable files and it doesn't requires a destructor, 
		because of internal configuration.
	
	
**/