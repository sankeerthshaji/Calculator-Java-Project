import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel; 
import javax.swing.SwingConstants;
import javax.swing.border.Border; 
import javax.swing.JFrame;  

	//implementing ActionListener interface
	public class CalculatorProject implements ActionListener{ 
		
		//variables
		int clickedOperator;
		String oldValue;
		
		JFrame jf;
		
		JLabel displaylabel,operatorscreen;
		
		JButton percentagebutton,deletebutton,clearbutton,sevenbutton,eightbutton,ninebutton,fourbutton,
		fivebutton,sixbutton,onebutton,twobutton,threebutton,signchangebutton,zerobutton,dotbutton,
		equaltobutton,divbutton,multiplicationbutton,plusbutton,minusbutton;
		
		public CalculatorProject()   
		{  
			//Setting properties of JFrame(Window)
			jf=new JFrame("Calculator");
			jf.setLayout(null); 
			jf.setBounds(470, 130, 450, 575);
			jf.getContentPane().setBackground(Color.black);
			 
			//Setting property of displaylabel 
			displaylabel=new JLabel();  
			displaylabel.setBounds(135, 35, 270, 55);                                         
			displaylabel.setOpaque(true); 
			displaylabel.setBackground(Color.white); 
			displaylabel.setForeground(Color.black);
			Border colorBorder= BorderFactory.createLineBorder(Color.black,1);
			displaylabel.setBorder(colorBorder);
			displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
			displaylabel.setFont(new Font("Serif", Font.PLAIN, 40));
			jf.add(displaylabel);
			
			//Setting property of operatorscreen
			operatorscreen=new JLabel();  
	    	operatorscreen.setBounds(30, 35, 105, 55);                                          
	    	operatorscreen.setOpaque(true); 
	    	operatorscreen.setBackground(Color.white); 
	    	operatorscreen.setForeground(Color.black);
	    	Border colorBorder2= BorderFactory.createLineBorder(Color.black,1);
			operatorscreen.setBorder(colorBorder2);
	    	operatorscreen.setHorizontalAlignment(SwingConstants.CENTER);
	    	operatorscreen.setVerticalAlignment(SwingConstants.CENTER);
	    	operatorscreen.setFont(new Font("Serif", Font.PLAIN, 35));
			jf.add(operatorscreen);
			
			// Setting property of percentage(%) button 
			percentagebutton=new JButton("%");
			percentagebutton.setBounds(48, 120, 70, 60);
			percentagebutton.setFont(new Font("Arial", Font.PLAIN, 28)); 
			percentagebutton.setBackground(Color.red);
			jf.add(percentagebutton);
			percentagebutton.addActionListener(this);
			
			// Setting property of delete button           
			deletebutton=new JButton("DEL");
			deletebutton.setBounds(138, 120, 70, 60); 
			deletebutton.setFont(new Font("Arial", Font.PLAIN, 18)); 
			deletebutton.setBackground(Color.red);
			jf.add(deletebutton);
			deletebutton.addActionListener(this);
			
			// Setting property of clear button   
			clearbutton=new JButton("AC");
			clearbutton.setBounds(228, 120, 70, 60);
			clearbutton.setFont(new Font("Arial", Font.PLAIN, 23)); 
			clearbutton.setBackground(Color.red);
			jf.add(clearbutton); 
			clearbutton.addActionListener(this);
			
			// Setting property of button 7
			sevenbutton=new JButton("7");
			sevenbutton.setBounds(48, 200, 70, 60);
			sevenbutton.setFont(new Font("Arial", Font.PLAIN, 30)); 
			jf.add(sevenbutton); 
			sevenbutton.addActionListener(this);	
			
			// Setting property of button 8
		    eightbutton=new JButton("8");
			eightbutton.setBounds(138, 200, 70, 60);
			eightbutton.setFont(new Font("Arial", Font.PLAIN, 30)); 
			jf.add(eightbutton);
			eightbutton.addActionListener(this);
			
			// Setting property of button 9
			ninebutton=new JButton("9");
			ninebutton.setBounds(228, 200, 70, 60);
			ninebutton.setFont(new Font("Arial", Font.PLAIN, 30)); 
			jf.add(ninebutton);
			ninebutton.addActionListener(this);
			
			// Setting property of button 4
			fourbutton=new JButton("4");
			fourbutton.setBounds(48, 280, 70, 60);
			fourbutton.setFont(new Font("Arial", Font.PLAIN, 30)); 
			jf.add(fourbutton);
			fourbutton.addActionListener(this);
			
			// Setting property of button 5
			fivebutton=new JButton("5");
			fivebutton.setBounds(138, 280, 70, 60);
			fivebutton.setFont(new Font("Arial", Font.PLAIN, 30)); 
			jf.add(fivebutton);
			fivebutton.addActionListener(this);
			
			// Setting property of button 6
			sixbutton=new JButton("6");
			sixbutton.setBounds(228, 280, 70, 60);
			sixbutton.setFont(new Font("Arial", Font.PLAIN, 30)); 
			jf.add(sixbutton);
			sixbutton.addActionListener(this);
			
			// Setting property of button 1
			onebutton=new JButton("1");
			onebutton.setBounds(48, 360, 70, 60);
			onebutton.setFont(new Font("Arial", Font.PLAIN, 30)); 
			jf.add(onebutton);
			onebutton.addActionListener(this);
			
			// Setting property of button 2
			twobutton=new JButton("2");
			twobutton.setBounds(138, 360, 70, 60);
			twobutton.setFont(new Font("Arial", Font.PLAIN, 30)); 
			jf.add(twobutton);
			twobutton.addActionListener(this);
			
			// Setting property of button 3
			threebutton=new JButton("3");
			threebutton.setBounds(228, 360, 70, 60);
			threebutton.setFont(new Font("Arial", Font.PLAIN, 30)); 
			jf.add(threebutton);
			threebutton.addActionListener(this);
			
			// Setting property of signchangebutton(+/-) button
			signchangebutton=new JButton("+/-");
			signchangebutton.setBounds(48, 440, 70, 60);
			signchangebutton.setFont(new Font("Arial", Font.PLAIN, 29)); 
			jf.add(signchangebutton);
			signchangebutton.addActionListener(this);
			 
			// Setting property of button 0 
			zerobutton=new JButton("0");
			zerobutton.setBounds(138, 440, 70, 60);
			zerobutton.setFont(new Font("Arial", Font.PLAIN, 30)); 
			jf.add(zerobutton);
			zerobutton.addActionListener(this);
			
			// Setting property of dot(.) button
		    dotbutton=new JButton(".");
			dotbutton.setBounds(228, 440, 70, 60);
			dotbutton.setFont(new Font("Arial", Font.PLAIN, 45)); 
			jf.add(dotbutton);
			dotbutton.addActionListener(this);
			
			// Setting property of equalto(=) button 
			equaltobutton=new JButton("=");
		    equaltobutton.setBounds(318, 440, 70, 60);
		    equaltobutton.setFont(new Font("Arial", Font.PLAIN, 35));
		    equaltobutton.setBackground(Color.orange);
			jf.add(equaltobutton);
			equaltobutton.addActionListener(this);
			
			// Setting property of division(÷) button 
			divbutton=new JButton("÷");
			divbutton.setBounds(318, 120, 70, 60);
			divbutton.setFont(new Font("Arial", Font.PLAIN, 35)); 
			divbutton.setBackground(Color.orange);
			jf.add(divbutton);
			divbutton.addActionListener(this);
			
			// Setting property of multiplication(x) button               
			multiplicationbutton=new JButton("x");
			multiplicationbutton.setBounds(318, 200, 70, 60);
			multiplicationbutton.setFont(new Font("Arial", Font.PLAIN, 35));
			multiplicationbutton.setBackground(Color.orange);
			jf.add(multiplicationbutton);
			multiplicationbutton.addActionListener(this);
			
			// Setting property of minus(-) button 
			minusbutton=new JButton("-");
			minusbutton.setBounds(318, 280, 70, 60);
			minusbutton.setFont(new Font("Arial", Font.PLAIN, 35)); 
			minusbutton.setBackground(Color.orange);
			jf.add(minusbutton);
			minusbutton.addActionListener(this);
			
			// Setting property of plus(+) button 
			plusbutton=new JButton("+");
			plusbutton.setBounds(318, 360, 70, 60);
			plusbutton.setFont(new Font("Arial", Font.PLAIN, 35)); 
			plusbutton.setBackground(Color.orange);
			jf.add(plusbutton);
			plusbutton.addActionListener(this);
			
			jf.setVisible(true);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		
	public static void main(String[] args) {
		
			new CalculatorProject();
			
		} 
	//Overriding actionPerformed() method
	@Override
	public void actionPerformed(ActionEvent e) {
		//Setting functionality for percentage(%) button
        if(e.getSource()== percentagebutton) { 
        	operatorscreen.setText("%");
			float num=Float.parseFloat(displaylabel.getText());
			num = num / 100; 
			displaylabel.setText(num + "");
        }
		//Setting functionality for delete button(backspace)
        else if(e.getSource()== deletebutton) {
        	
            int  length=displaylabel.getText().length();
        	int number =length-1;
        	
        	if(length>0) {
        		 
        		StringBuilder Back=new StringBuilder(displaylabel.getText());
        		Back.deleteCharAt(number);
        		displaylabel.setText(Back+"");
        	}
        }
		//Setting functionality for clear button
	    else if(e.getSource()== clearbutton) {
        	
        	operatorscreen.setText("");
	    	displaylabel.setText("");
	    }
		//Setting functionality for 7 button
        else if(e.getSource()== sevenbutton) {
			
			if(clickedOperator==1) {
				 
				displaylabel.setText("7");
				clickedOperator=11; 
				
			}else if(clickedOperator==2) {
				 
			   displaylabel.setText("7");
			   clickedOperator=22; 
				
		}else if(clickedOperator==3) {
				
				displaylabel.setText("7");
				clickedOperator=33;
				
		}else if(clickedOperator==4) {
			 
				displaylabel.setText("7");
				clickedOperator=44; 
				
			}else {
				displaylabel.setText(displaylabel.getText()+"7"); 
			}
		}
		//Setting functionality for 8 button
		else if(e.getSource()== eightbutton) { 
				
				if(clickedOperator==1) {
					 
					displaylabel.setText("8");
					clickedOperator=11; 
					
				}else if(clickedOperator==2) {
					 
				   displaylabel.setText("8");
				   clickedOperator=22; 
					
			}else if(clickedOperator==3) {
					
					displaylabel.setText("8");
					clickedOperator=33;
					
			}else if(clickedOperator==4) {
				 
					displaylabel.setText("8");
					clickedOperator=44; 
					
				}else {
					displaylabel.setText(displaylabel.getText()+"8"); 
				}
				
	    }
		//Setting functionality for 9 button
			else if(e.getSource()== ninebutton) {
					
				if(clickedOperator==1) {
					 
					displaylabel.setText("9");
					clickedOperator=11; 
					
				}else if(clickedOperator==2) {
					 
				   displaylabel.setText("9");
				   clickedOperator=22; 
					
			}else if(clickedOperator==3) {
					
					displaylabel.setText("9");
					clickedOperator=33;
					
			}else if(clickedOperator==4) {
				 
					displaylabel.setText("9");
					clickedOperator=44;  
					
				}else {
					displaylabel.setText(displaylabel.getText()+"9"); 
				}
			}
		//Setting functionality for 4 button
			else if(e.getSource()== fourbutton) {
				
				if(clickedOperator==1) {
					 
					displaylabel.setText("4");
					clickedOperator=11; 
					
				}else if(clickedOperator==2) {
					 
				   displaylabel.setText("4");
				   clickedOperator=22; 
					
			}else if(clickedOperator==3) {
					
					displaylabel.setText("4");
					clickedOperator=33;
					
			}else if(clickedOperator==4) {
				 
					displaylabel.setText("4");
					clickedOperator=44; 
					
				}else {
					displaylabel.setText(displaylabel.getText()+"4"); 
				}
	    }
		//Setting functionality for 5 button
			else if(e.getSource()== fivebutton) {
			
				if(clickedOperator==1) {
					 
					displaylabel.setText("5");
					clickedOperator=11; 
					
				}else if(clickedOperator==2) {
					 
				   displaylabel.setText("5");
				   clickedOperator=22; 
					
			}else if(clickedOperator==3) {
					
					displaylabel.setText("5");
					clickedOperator=33;
					
			}else if(clickedOperator==4) {
				 
					displaylabel.setText("5");
					clickedOperator=44; 
					
				}else {
					displaylabel.setText(displaylabel.getText()+"5"); 
				}
	    }
		//Setting functionality for 6 button
			else if(e.getSource()== sixbutton) {
			
				if(clickedOperator==1) {
					 
					displaylabel.setText("6");
					clickedOperator=11; 
					
				}else if(clickedOperator==2) {
					 
				   displaylabel.setText("6");
				   clickedOperator=22; 
					
			}else if(clickedOperator==3) {
					
					displaylabel.setText("6");
					clickedOperator=33;
					
			}else if(clickedOperator==4) {
				 
					displaylabel.setText("6");
					clickedOperator=44; 
					
				}else {
					displaylabel.setText(displaylabel.getText()+"6"); 
				}    }
		//Setting functionality for 1 button
			else if(e.getSource()== onebutton) {
				if(clickedOperator==1) {
					 
					displaylabel.setText("1");
					clickedOperator=11; 
					
				}else if(clickedOperator==2) {
					 
				   displaylabel.setText("1");
				   clickedOperator=22; 
					
			}else if(clickedOperator==3) {
					
					displaylabel.setText("1");
					clickedOperator=33;
					
			}else if(clickedOperator==4) {
				 
					displaylabel.setText("1");
					clickedOperator=44; 
					
				}else {
					displaylabel.setText(displaylabel.getText()+"1"); 
				}
	    }
		//Setting functionality for 2 button
			else if(e.getSource()== twobutton) {
			
				if(clickedOperator==1) {
					 
					displaylabel.setText("2");
					clickedOperator=11; 
					
				}else if(clickedOperator==2) {
					 
				   displaylabel.setText("2");
				   clickedOperator=22; 
					
			}else if(clickedOperator==3) {
					
					displaylabel.setText("2");
					clickedOperator=33;
					
			}else if(clickedOperator==4) {
				 
					displaylabel.setText("2");
					clickedOperator=44; 
					
				}else {
					displaylabel.setText(displaylabel.getText()+"2"); 
				}
	    }
		//Setting functionality for 3 button
			else if(e.getSource()== threebutton) {
				
				if(clickedOperator==1) {
					 
					displaylabel.setText("3");
					clickedOperator=11; 
					
				}else if(clickedOperator==2) {
					 
				   displaylabel.setText("3");
				   clickedOperator=22; 
					
			}else if(clickedOperator==3) {
					
					displaylabel.setText("3");
					clickedOperator=33;
					
			}else if(clickedOperator==4) {
				 
					displaylabel.setText("3");
					clickedOperator=44; 
					
				}else {
					displaylabel.setText(displaylabel.getText()+"3");
				}
			}
		//Setting functionality for plusminus(+/-) button
           else if(e.getSource()== signchangebutton) {
        	   
			float neg=Float.parseFloat(displaylabel.getText());
			neg = neg*-1;
			displaylabel.setText(neg+"");
           }
		//Setting functionality for 0 button
	        else if(e.getSource()== zerobutton) {
	    			
	        	if(clickedOperator==1) {
	   			 
	    			displaylabel.setText("0");
	    			clickedOperator=11; 
	    			
	    		}else if(clickedOperator==2) {
	    			 
	    		   displaylabel.setText("0");
	    		   clickedOperator=22; 
	    			
	    	}else if(clickedOperator==3) {
	    			
	    			displaylabel.setText("0");
	    			clickedOperator=33;
	    			
	    	}else if(clickedOperator==4) {
	    		 
	    			displaylabel.setText("0");
	    			clickedOperator=44; 
	    			
	    		}else {
	    			displaylabel.setText(displaylabel.getText()+"0"); 
	    		}
	    }
	     //Setting functionality for dot(.) button
			else if(e.getSource()== dotbutton) {
				
				if(!displaylabel.getText().contains(".")) {
			displaylabel.setText(displaylabel.getText()+".");
				}
			} 
		//Setting functionality for equal(=) button
	        else if(e.getSource()== equaltobutton) {
	        	
	        	operatorscreen.setText("Ans");
	        	
	        	String newValue=displaylabel.getText();
	        	
	        	float oldValueF=Float.parseFloat(oldValue);
	        	float newValueF=Float.parseFloat(newValue);
	        	
	        	if(clickedOperator==11) {
	        		
	                float result=oldValueF/newValueF;
	            	
	            	displaylabel.setText(result+"");
	        		
	        	}else if(clickedOperator==22) {
	        		
	                float result=oldValueF*newValueF;
	            	
	            	displaylabel.setText(result+"");
	        	}else if(clickedOperator==33) {
	        		
	        		float result=oldValueF+newValueF;
	            	
	            	displaylabel.setText(result+"");
	        	}else if(clickedOperator==44) {
	        		
	        		float result=oldValueF-newValueF;
	            	
	            	displaylabel.setText(result+"");
	        	}
	        }
		    //Setting functionality for division(÷) button
	        else if(e.getSource()== divbutton) { 
	        	
	        	operatorscreen.setText("÷");
	        	
	            clickedOperator=1;
	    		
	    		oldValue=displaylabel.getText();
	        	
	    }
		//Setting functionality for multiplication(x) button 
	        else if(e.getSource()== multiplicationbutton) {
	        	
	        	operatorscreen.setText("x");
	        	
	            clickedOperator=2;
	    		
	    		oldValue=displaylabel.getText();
	        	
	    }
		//Setting functionality for plusbutton(+) button
	        else if(e.getSource()== plusbutton) {
	        	
	        	operatorscreen.setText("+");
	  
	    	    clickedOperator=3;
	    		
	    		oldValue=displaylabel.getText();
	    	}
		//Setting functionality for minus(-) button
	        else if(e.getSource()== minusbutton) {
	        	
	        	operatorscreen.setText("-");
	        	
	            clickedOperator=4;
	    		
	    		oldValue=displaylabel.getText();
	        	
	        }
	}
	}
	
		
		
	        		
	



