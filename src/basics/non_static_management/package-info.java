/**
 * 
 */
/**
 * @author praveenrao
 *
 */
package basics.non_static_management;

/**
	##################################
	#           GROUND-RULE			 #
	##################################
	
	non-static member can't referenced from static context
	means non-static attributes and methods can't used straight away
	in main method or any static block 
	
	##################################
	##       OBJECT_CREATION	    ##
	##################################
	
	--how to create an object
	class_name variable = new classname;
	
	--why we create an object
	**to use non-static variable and methods inside static block.
	**object is created in heap memory
	**when object is created only non-static members loading to the memory
*/