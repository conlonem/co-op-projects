/*
        Interface.java - Assignment 2
        *Author: Emily Conlon
        *Student No: 3331128
        *Date: 31/05/2019
        *Description:
         Interface class for Assignment 2 Program
*/ 
import java.util.*;
import java.io.*;
public class Interface {

	private Depot[] depotArray = new Depot[4];
	private Product[] productArray = new Product[5];

	Depot depot1 = new Depot();
	Depot depot2 = new Depot();
	Product product1 = new Product();
	Product product2 = new Product();
	Product product3 = new Product();
    Scanner scanner = new Scanner(System.in);    
	boolean result;
	boolean exit;
	boolean tryAgain;
	int choice = 0;
	int depotChoice = 0;
	int value = 0;
	int productChoice = 0;
	int productQuantity = 0;
	int productDelete = 0;
	int i = 0;
	int p = 0;
	int d = 0;
	int z = 0;
	int depotVar;
	int productVar;
	double productWeight = 0;
	double productPrice = 0;
	String depotName;
	String productName;
	String depotDelete;
	String fileNameInput;
	String fileName;
	

    public static void main (String[]args) {    	
    	Interface intFace = new Interface();
    	intFace.run();
    }

    public void run() {

    	while (!exit) {
    		mainMenu();
    		int choice = menuInput(); 
    		menuAction(choice);
    	}
    }

    public void mainMenu() {

		System.out.println("");

	    System.out.println("Main Menu: ");

	    System.out.println("");
	    System.out.println("1       Add a new depot");
	    System.out.println("2       Remove a depot");
	    System.out.println("3       Add a new product to an existing depot");
	    System.out.println("4       Remove an existing product");
	    System.out.println("5       Show existing depots");
	    System.out.println("6       Show existing products");
	    System.out.println("7       Search for a product");
	    System.out.println("8       Calculate depot value");
	    System.out.println("9       Exit program");
	    System.out.println("10      Import file");
	    System.out.println("11      Export file");
	    System.out.println("12      File Information");

	    System.out.println("");
    }
    // Enter your choice of action
    public int menuInput() {
    	do {
    		System.out.println("Please enter your choice: ");
			choice = scanner.nextInt();
			System.out.println("");
		} while (intInputCheck(choice) == false);
		return choice;
    }
    // Main Section for each action of the menu
    public void menuAction (int choice) {
    	switch (choice) {
            case 1: {
                try {
                	while (true) {
	                	if (depotArray[i] != null) {
		                		i++;
		                		System.out.println("");
		                } else {
		               		System.out.println("~Adding a new depot~");
		               		System.out.println("");
		               		addDepot(i);
		               		break;
		                }
                	}
                } catch (ArrayIndexOutOfBoundsException a) {
                	System.out.println("Unable to add another Depot, please delete an existing depot before continuing.");
                }
                	
            }
            break;

            case 2: {
          			boolean tryAgain;
            		do {
            			try {
            				System.out.println("");
            				i = scanner.nextInt();
            				if (intInputCheck(i) == false) {
            					tryAgain = true;
							} else {
								removeDepot(i);
            					tryAgain = false;
							}
            				;
            			} catch (NullPointerException f) {
            				System.out.println("Depot does not exist, please input again.");
            				tryAgain = true;
            			}
            		} while (tryAgain == true);	
            }    
            break;

            case 3: {
            	do {
            		System.out.println("Please enter the chosen depot to add product to: ");
					System.out.println("");
            		System.out.println("  0        [ Depot 1 ]");
            		try {
            			System.out.println("       Name: "+depotArray[0].getDName());
            			System.out.println("");
            		} catch (NullPointerException b) {
            			System.out.println("Depot 1 does not exist.");
            			System.out.println("");
            		}
            		System.out.println("  1        [ Depot 2 ]");
            		try {
            			System.out.println("       Name: "+depotArray[1].getDName());
            			System.out.println("");
            		} catch (NullPointerException c) {
            			System.out.println("Depot 2 does not exist.");
            			System.out.println("");
            		}            		
            		System.out.println("  2        [ Depot 3 ]");
            		try {
            			System.out.println("       Name: "+depotArray[2].getDName());
            			System.out.println("");
            		} catch (NullPointerException d) {
            			System.out.println("Depot 3 does not exist.");
            			System.out.println("");
            		}            		
            		System.out.println("  3        [ Depot 4 ]");
            		try {
            			System.out.println("       Name: "+depotArray[3].getDName());
            			System.out.println("");
            		} catch (NullPointerException e) {
            			System.out.println("Depot 4 does not exist.");
            			System.out.println("");
            		}            		
          			boolean tryAgain;
            		do {
            			try {
            				System.out.println("");
            				i = scanner.nextInt();
            				if (intInputCheck(i) == false) {
            					tryAgain = true;
            				} else 
            					tryAgain = false;
            			} catch (NullPointerException f) {
            				System.out.println("Depot does not exist, please input again.");
            				tryAgain = true;
            			}
            		} while (tryAgain == true);

					try {
                		while (true) {
	                		if (depotArray[i].productArray[p] != null) {
		                		p++;
		                		System.out.println("");
		               		} else {
		               			System.out.println("~Adding a new product to Depot "+depotArray[i].getDName()+"~");
		               			System.out.println("");
		               			addProduct(i,p);
		               			break;
		                	}
                		}
                	} catch (ArrayIndexOutOfBoundsException a) {
                	System.out.println("Unable to add another product, please delete an existing product before continuing.");
                	}
            	} while (intInputCheck(i) == false);
            }
            break;
            case 4: {
            	System.out.println("Please enter which depot you would like to remove product from: ");
    			System.out.println("");
    			System.out.println("(0) Depot 1     (1) Depot 2     (2) Depot 3     (3) Depot 4");
    			int removeProduct1 = scanner.nextInt();
		    	System.out.println("Please enter which product you wish to remove: ");
		    	System.out.println("");
    			System.out.println("(0) Product 1  (1) Product 2  (2) Product 3  (3) Product 4  (4) Product 5");
    			int removeProduct2 = scanner.nextInt();
    			removeProduct(removeProduct1,removeProduct2);
            }
            break;
            case 5:
                System.out.println("~Existing depots~");
                showDepots();
                break;
            case 6: {
            	do {
            		System.out.println("~Existing products~");
                	System.out.println("");
            		System.out.println("Please enter chosen depot to view products: ");
            		System.out.println("");
            		System.out.println("  0        [ Depot 1 ]");
            		System.out.println("  1        [ Depot 2 ]");
            		System.out.println("  2        [ Depot 3 ]");
            		System.out.println("  3        [ Depot 4 ]");
            		d = scanner.nextInt();
            	} while (intInputCheck(depotChoice) == false);
            	showProducts(d);
            }    
            break;
			case 7: {
                do {
                	System.out.println("~Searching for product~");
                	System.out.println("");
            		System.out.println("Please enter chosen depot of product: ");
            		System.out.println("1        [ Depot 1 ]");
            		System.out.println("2        [ Depot 2 ]");
            		int depotChoice = scanner.nextInt();

            	} while (intInputCheck(depotChoice) == false);
                if (depotChoice == 1) {
                	System.out.println("Please enter product name: ");
                	String productSearch = scanner.nextLine();
                	searchProduct(depot1,productSearch);
                } else {
                	System.out.println("Please enter product name: ");
                	String productSearch = scanner.nextLine();
                	searchProduct(depot2,productSearch);
                }	
            }
            break;
            case 8: {
				System.out.println("Please enter which depot you would like to calculate total product value: ");
    			System.out.println("");
    			System.out.println("(0) Depot 1     (1) Depot 2     (2) Depot 3     (3) Depot 4");
    			int calculateDepot = scanner.nextInt();
    			double originalValueP = 0;
    			try {
                	while (true) {
	                	if (depotArray[calculateDepot].productArray[z] != null) {
		                	double calculateValueP = originalValueP+depotArray[calculateDepot].productArray[z].getPrice()*depotArray[calculateDepot].productArray[z].getQuantity();
		                	originalValueP = calculateValueP;
		                	z++;
		                	if (z == 6){
		                		break;
		                	}
		                	System.out.println("");
		                	
		                } else {
		                	System.out.println(originalValueP);
		                }
                	}
                } catch (NullPointerException z) {
                	System.out.println(originalValueP);
                }
            }
            break;
            case 9:
                System.out.println("Exiting program...");
                System.exit(0);
            	break;
            case 10: 
            	System.out.println("~Importing a new file~");
            	importFile();
            	break;
            case 11: { 
            	System.out.println("~Exporting your file~");
	            System.out.println("");
	            int counter1 = 0;
		    	do {
		    		try {
		    			System.out.println("Please enter the desired name of your new file: ");
				        fileNameInput = scanner.next();
				        File newFile = new File(fileNameInput+".txt");
			    	    if (newFile.createNewFile()) {
			        	   	System.out.println("New file "+newFile.getName()+" successfully created.");
			            	tryAgain = false;
			    	    } else {
			        	   	System.out.println("File already exists, please input a different file name to export successfully.");
			            	tryAgain = true;
			            }
		            } catch (IOException e) {
		            	System.out.println("An error occured. Please try again.");
		            }
			    } while (tryAgain == true);
			    exportFile(fileName);

			}    	
            break;
            case 12: 
            	System.out.println("~ File Information ~");
            	showFileInfo();
            break;
        }
    }
    // Adds a new depot with a name. Max of four
    private void addDepot(int i) {
    	
    	depotArray[i] = new Depot();
   		System.out.println("Please enter new depot name: ");
   		String depotName = scanner.next().toLowerCase();
   		System.out.println("");
   		depotArray[i].setDName(depotName);
   		System.out.println("New Depot successfully created.");
   		System.out.println("Name: " + depotArray[i].getDName());
    }
    // Removes an existing depot by typing in the name
    private void removeDepot(int i) {
        System.out.println("");
       	System.out.println("Deleting Depot " + depotArray[i].getDName() + "...");
       	depotArray[i] = null;
       	System.gc();
    }
    //Adds a new product to an existing depot, including its weight, cost and quantity
    private void addProduct(int i, int p) {
    	int yesNo;
    	do {
    		depotArray[i].productArray[p] = new Product();
    		System.out.println("[ Product "+p+"]");
	        System.out.println("");
	      	System.out.println("Please enter name of new product: ");
	       	productName = scanner.next();
	       	depotArray[i].productArray[p].setName(productName);
			System.out.println("");
			System.out.println("Please enter price of product: ");
			productPrice = scanner.nextDouble();
			depotArray[i].productArray[p].setPrice(productPrice);
			System.out.println("");
	        System.out.println("Please enter weight of new product: ");
	        productWeight = scanner.nextDouble();
	        depotArray[i].productArray[p].setWeight(productWeight);
	        System.out.println("");
	        System.out.println("Please enter quantity of new product: ");
	        productQuantity = scanner.nextInt();
	        depotArray[i].productArray[p].setQuantity(productQuantity);

	        System.out.println("");
        	System.out.println("~Product "+p+" details~"); 
        	System.out.println("Name: " + depotArray[i].productArray[p].getName());
        	System.out.println("Price: " + depotArray[i].productArray[p].getPrice());
        	System.out.println("Weight: " + depotArray[i].productArray[p].getWeight());
        	System.out.println("Quantity: " + depotArray[i].productArray[p].getQuantity());
        	System.out.println("");
        	System.out.println("Confirm? (0) Yes   (1) No");
        	yesNo = scanner.nextInt();

    	} while (yesNo == 1);       				
    }
    //Removes an existing product from a selected depot
    private void removeProduct(int rp1, int rp2) {
    	depotArray[rp1].productArray[rp2] = null;
    	System.gc();
    }
    //Shows all the existing depots
    private void showDepots() {

   		System.out.println("");
    	System.out.println("");
    	System.out.println("          [ Depot 1 ]");
    	try {
    		System.out.println("       Name: "+depotArray[0].getDName());
    		int counter = 0;
    		int i = 0;	
    		while (i < 5) {
    			if (depotArray[0].productArray[i] != null) {
    				i++;
    				counter++;
    			} else if (depotArray[0].productArray[i] == null){
    				i++;
    			}
    		} 
    		System.out.println("Depot 1 has "+counter+" product/s.");
        	System.out.println("");
        } catch (NullPointerException b) {
        	System.out.println("Depot 1 does not exist.");
        	System.out.println("");
        }

        System.out.println("          [ Depot 2 ]");
        try {
        	System.out.println("       Name: "+depotArray[1].getDName());
    		int counter = 0;
    		int i = 0;	
    		while (i < 5) {
    			if (depotArray[1].productArray[i] != null) {
    				i++;
    				counter++;
    			} else if (depotArray[1].productArray[i] == null){
    				i++;
    			}
    		} 
    		System.out.println("Depot 2 has "+counter+" product/s.");        	
        	System.out.println("");
        } catch (NullPointerException c) {
        	System.out.println("Depot 2 does not exist.");
        	System.out.println("");
        }            		

        System.out.println("          [ Depot 3 ]");
        try {
        	System.out.println("       Name: "+depotArray[2].getDName());
        	int counter = 0;
        	int i = 0;	
    		while (i < 5) {
    			if (depotArray[2].productArray[i] != null) {
    				i++;
    				counter++;
    			} else if (depotArray[2].productArray[i] == null) {
    				i++;
    			}
    		} 
    		System.out.println("Depot 3 has "+counter+" product/s.");
        	System.out.println("");
        } catch (NullPointerException d) {
        	System.out.println("Depot 3 does not exist.");
        	System.out.println("");
        }            

        System.out.println("          [ Depot 4 ]");
        try {
        	System.out.println("       Name: "+depotArray[3].getDName());
        	int counter = 0;
        	int i = 0;	
    		while (i < 5) {
    			if (depotArray[3].productArray[i] != null) {
    				i++;
    				counter++;
    			} else if (depotArray[3].productArray[i] == null){
    				i++;
    			}
    		} 

    		System.out.println("Depot 4 has "+counter+" product/s.");
        	System.out.println("");
        } catch (NullPointerException e) {
        	System.out.println("Depot 4 does not exist.");
        	System.out.println("");
        }
    }
    //Shows all the existing products of a selected depot
    private void showProducts(int d) {
    	System.out.println("     ~ Depot Product List ~");
    	System.out.println("");

    	System.out.println("    [ Product 1 ]");
    	try {
    		System.out.println("");
        	System.out.println("Name: " + depotArray[d].productArray[0].getName());
        	System.out.println("Price: " + depotArray[d].productArray[0].getPrice());
        	System.out.println("Weight: " + depotArray[d].productArray[0].getWeight());
        	System.out.println("Quantity: " + depotArray[d].productArray[0].getQuantity());
        	System.out.println("");    		
    	} catch (NullPointerException g) {
    		System.out.println("Product 1 does not exist.");
    		System.out.println("");
    	}

    	System.out.println("    [ Product 2 ]");
    	try {
    		System.out.println("");
        	System.out.println("Name: " + depotArray[d].productArray[1].getName());
        	System.out.println("Price: " + depotArray[d].productArray[1].getPrice());
        	System.out.println("Weight: " + depotArray[d].productArray[1].getWeight());
        	System.out.println("Quantity: " + depotArray[d].productArray[1].getQuantity());
        	System.out.println("");    		
    	} catch (NullPointerException g) {
    		System.out.println("Product 2 does not exist.");
    		System.out.println("");
    	}

    	System.out.println("    [ Product 3 ]");
    	try {
    		System.out.println("");
        	System.out.println("Name: " + depotArray[d].productArray[2].getName());
        	System.out.println("Price: " + depotArray[d].productArray[2].getPrice());
        	System.out.println("Weight: " + depotArray[d].productArray[2].getWeight());
        	System.out.println("Quantity: " + depotArray[d].productArray[2].getQuantity());
        	System.out.println("");    		
    	} catch (NullPointerException g) {
    		System.out.println("Product 3 does not exist.");
    		System.out.println("");
    	}

    	System.out.println("    [ Product 4 ]");
    	try {
    		System.out.println("");
        	System.out.println("Name: " + depotArray[d].productArray[3].getName());
        	System.out.println("Price: " + depotArray[d].productArray[3].getPrice());
        	System.out.println("Weight: " + depotArray[d].productArray[3].getWeight());
        	System.out.println("Quantity: " + depotArray[d].productArray[3].getQuantity());
        	System.out.println("");    		
    	} catch (NullPointerException g) {
    		System.out.println("Product 4 does not exist.");
    		System.out.println("");
    	}

    	System.out.println("    [ Product 5 ]");
    	try {
    		System.out.println("");
        	System.out.println("Name: " + depotArray[d].productArray[4].getName());
        	System.out.println("Price: " + depotArray[d].productArray[4].getPrice());
        	System.out.println("Weight: " + depotArray[d].productArray[4].getWeight());
        	System.out.println("Quantity: " + depotArray[d].productArray[4].getQuantity());
        	System.out.println("");    		
    	} catch (NullPointerException g) {
    		System.out.println("Product 5 does not exist.");
    		System.out.println("");
    	}

    }
    //Searches for a product in a selected depot
    private void searchProduct(Depot object, String productName) {

    }
    //calculates the value of all the products of a certain depot
    private double calculateValue(Depot object) {
    	double depotValue = 1;
    	return depotValue;
    }
    //Imports the data of existing depots and products
    private void importFile() {
    	System.out.println("Please specify import file name: ");
    	String nameInput = scanner.next();
    	readFile(nameInput);
    }
    //Exports the data of existing depots and products
    public void exportFile(String fname) {
    	System.out.println("Creating new file...");
    	System.out.println("");
    	int w = 0;
    	int v = 0;
    	try {
    		BufferedWriter exportWrite = new BufferedWriter(new FileWriter(fname+".txt",true));
    		try {
    			do {
	    			do {
	    				exportWrite.write(depotArray[w].getDName()+"-depot "+depotArray[w].productArray[v].getName()+" "+depotArray[w].productArray[v].getPrice()+" "+depotArray[w].productArray[v].getWeight()+" "+depotArray[w].productArray[v].getQuantity());
	    				exportWrite.newLine();
	    				v++;
	    				System.out.println("test");
	    			} while (v < 6);
    				w++;
    			} while (w < 5);
    			System.out.println("File successfully written.");
    		} catch (NullPointerException h) {
    			exportWrite.write("");
    			exportWrite.close();
    		}
    	} catch (IOException g) {
    		System.out.println("An error occured.");
    	}
    }
    //Shows the information of the file
    private void showFileInfo() {
    	File newFile = new File(fileName+".txt");
    	if (newFile.exists()) {
    		System.out.println("Name of file: "+newFile.getName());
    		System.out.println("");
    		System.out.println("File path: "+newFile.getAbsolutePath());
    		System.out.println("");
    		System.out.println("File size: "+newFile.length()+" bytes.");
    		System.out.println("");
    		System.out.println("Read: "+newFile.canRead()+"    Write: "+newFile.canWrite());

    	} else {
    		System.out.println("This file does not exist.");
    	}
    }
    //Reads the information of the existing file
    private void readFile(String fileName) {
    	try {
    		File newFile = new File (fileName+".txt");
    		Scanner fileRead = new Scanner(newFile);
    		while (fileRead.hasNextLine()) {
    			String data = fileRead.nextLine();
    			System.out.println(data);
    		}
    		fileRead.close();
    	} catch (FileNotFoundException k) {
    		System.out.println("An error occured.");
    	}
    }

    //Integer input check
    private boolean intInputCheck (int intInput) {

		if ((intInput < 0) || (intInput > 12)) {
			System.out.println("Invalid input. Please try again.");
			return false;
		} else 
			return true;
	}
}

