
import tkinter
import tkinter.messagebox
import emp
import sqlite3
import mysql.connector

#connect to the database
mydb =  mysql.connector.connect(

        host = "localhost",
        user = "flu",
        passwd = "flu",
        database="emp_db"
    )

mycursor = mydb.cursor()
#create database if we don't have it
mycursor.execute("CREATE DATABASE IF not exists emp_db")
#create table if not existed
mycursor.execute("CREATE TABLE IF not exists `emp_db`.`Employee` ( `id` INT NOT NULL , `name` text NOT NULL , `department` text NOT NULL , `title` text NOT NULL , PRIMARY KEY (`id`))")
class employe:


    
    
    def __init__(self):
        # Create the main window.
        self.main_window = tkinter.Tk()

        # Create six frames to group widgets.
        self.frame1 = tkinter.Frame()
        self.frame2 = tkinter.Frame()
        self.frame3 = tkinter.Frame()
        self.frame4 = tkinter.Frame()
        self.frame5 = tkinter.Frame()
        self.frame6 = tkinter.Frame()
        
        # Create the widgets for the  frame1.
        self.prompt_label = tkinter.Label(self.frame1,
                    text='EMPLOYEE MANAGMENT SYSTEM')

        # Create the Employee ID lable
        self.emp_id = tkinter.Label(self.frame2,
                    text='Employee ID:')
                
        # Create the Employee ID entry
        self.id_entry = tkinter.Entry(self.frame2,
                                        width=10)
        # Create the lookup Employee button
        self.lookup_emp = tkinter.Button(self.frame2,
                                          text='Look Up Employee',
                                          command=self.lookup_emp)
                                          
        # Create the lable for the  Employee name.
        self.emp_name = tkinter.Label(self.frame3,
                    text='Employee Name:')
        # Create the entry for the  Employee name.
        self.name_entry = tkinter.Entry(self.frame3,
                                        width=10)
        # Create the button for the add Employee .
        self.add_emp = tkinter.Button(self.frame3,
                                          text='Add    Employee',
                                          command=self.add_emp)
                                          
        # Create the lable for the  Employee department.
        self.emp_dep = tkinter.Label(self.frame4,
                    text='Employee Dept')
        # Create the entry for the  Employee department.
        self.dept_entry = tkinter.Entry(self.frame4,
                                        width=10)
        # Create the button for the update Employee .
        self.upd_emp = tkinter.Button(self.frame4,
                                          text='Update Employe',
                                          command=self.upd_emp)
        
        # Create the lable for the  Employe Title.
        self.emp_title = tkinter.Label(self.frame5,
                    text='Employee Title')
         # Create the entry for the  Employe Title.
        self.title_entry = tkinter.Entry(self.frame5,
                                        width=10)
        # Create the button for the delete Employe .
        self.del_emp = tkinter.Button(self.frame5,
                                          text='Delete  Employee',
                                          command=self.del_emp)

        # Create the button for the  quit.
        self.quit = tkinter.Button(self.frame6,
                                          text='Quit',
                                          command=self.quit)
        # Pack the frame1
        self.prompt_label.pack()
        
        # Pack the frame2
        self.lookup_emp.pack( side='left')
        self.emp_id.pack(  side = 'left' )
        self.id_entry.pack(side =  'left')
        
        # Pack the frame3
        self.add_emp.pack(side = 'left'  )
        self.emp_name.pack(side = 'left' )
        self.name_entry.pack(side ='left')

        # Pack the frame4
        self.upd_emp.pack(side = 'left'   )
        self.emp_dep.pack(side = 'left'   )
        self.dept_entry.pack(side = 'left')

        # Pack the frame5
        self.del_emp.pack(side = 'left'   )
        self.emp_title.pack( side = 'left')
        self.title_entry.pack(side ='left')

        # Pack the frame6
        self.quit.pack( side ='left' )
        

        # Pack the frames.
        self.frame1.pack()
        self.frame2.pack()
        self.frame3.pack()
        self.frame4.pack()
        self.frame5.pack()
        self.frame6.pack()
        
        # Enter the tkinter main loop.
        tkinter.mainloop()
    
    def lookup_emp(self):
        #add the id entry to the ID
        ID = self.id_entry.get()
        
        #querry to select employee with the exact id
        sql="SELECT * FROM Employee WHERE id =%s"
        val=(ID,)
        mycursor.execute(sql,val)
        myresult = mycursor.fetchall()
        
        # gets the number of rows affected
        row_count = mycursor.rowcount
        
        # check if the id already exists
        if row_count == 0:
            tkinter.messagebox.showinfo('Response','This ID it does not exist')
        else:
            x=[]
            for x in myresult:
                continue
            result='Name:',x[1],'\nID Number :',x[0],'\nDepartment :',x[2],'\nTitle :',x[3]
            
            #print messagebox message.
            tkinter.messagebox.showinfo('Response',' '.join(map(str, result)))
            
            #Clear the entry
            self.name_entry.delete(0,'end')
            self.id_entry.delete(0,'end')
            self.dept_entry.delete(0,'end')
            self.title_entry.delete(0,'end')
        
    def add_emp(self):
        # Get employee information.
        name = self.name_entry.get()
        ID = self.id_entry.get()
        department = self.dept_entry.get()
        title = self.title_entry.get()
        
        #querry to select employee with the exact id
        sql="SELECT * FROM Employee WHERE id =%s"
        val=(ID,)
        mycursor.execute(sql,val)
        myresult = mycursor.fetchall()
        
        # gets the number of rows affected by the command executed
        row_count = mycursor.rowcount
        
        # check if the id already exists
        if row_count != 0:
            tkinter.messagebox.showinfo('Response','This ID already exist')
        else:#check for missing info
            if name=='':# missing name
                tkinter.messagebox.showinfo('Response',"please enter your name : ")
            elif ID =='':#missing Id
                tkinter.messagebox.showinfo('Response',"please enter your ID : ")
            elif department== '':# missing department
                tkinter.messagebox.showinfo('Response',"please enter your department : ")
            elif title == '':# missing title
                tkinter.messagebox.showinfo('Response',"please enter your title : ")
            else:
                #querry to update employee
                sql="INSERT INTO Employee (ID,Name,Department,Title) VALUES (%s,%s,%s,%s)"
                val=(ID,name,department,title)
                mycursor.execute(sql,val)
                mydb.commit()
                
                #print the result
                tkinter.messagebox.showinfo('Response',"The new employee has been added. ")
                
                #Clear the entry
                self.name_entry.delete(0,'end')
                self.id_entry.delete(0,'end')
                self.dept_entry.delete(0,'end')
                self.title_entry.delete(0,'end')
        
    def upd_emp(self):
        name = self.name_entry.get()
        ID = self.id_entry.get()
        department = self.dept_entry.get()
        title = self.title_entry.get()
        
        #querry to select from id for the specefic id
        sql="SELECT * FROM Employee WHERE id =%s"
        val=(ID,)
        mycursor.execute(sql,val)
        myresult = mycursor.fetchall()
        
        # gets the number of rows affected by the command executed
        row_count = mycursor.rowcount
        
        # check if the id already exists
        if row_count == 0:
            tkinter.messagebox.showinfo('Response','This ID does not exist you need to add a new employe first')
        else:
            if name=='':# missing name
                tkinter.messagebox.showinfo('Response',"please enter your name : ")
            elif ID =='':#missing Id
                tkinter.messagebox.showinfo('Response',"please enter your ID : ")
            elif department== '':# missing department
                tkinter.messagebox.showinfo('Response',"please enter your department : ")
            elif title == '':# missing title
                tkinter.messagebox.showinfo('Response',"please enter your title : ")
            else:
                
                #querry to update name with specefic id
                sql= "UPDATE Employee SET name = %s WHERE id = %s"
                val=(name,ID)
                mycursor.execute(sql,val)

                #querry to update department with specefic id
                sql= "UPDATE Employee SET Department = %s WHERE id = %s"
                val=(department,ID)
                mycursor.execute(sql,val)

                #querry to update title with specefic id
                sql= "UPDATE Employee SET Title = %s WHERE id = %s"
                val=(title,ID)
                mycursor.execute(sql,val)
                mydb.commit()
                tkinter.messagebox.showinfo('Response',"Employee information updated ")

                #clear the entry
                self.name_entry.delete(0,'end')
                self.id_entry.delete(0,'end')
                self.dept_entry.delete(0,'end')
                self.title_entry.delete(0,'end')

    def del_emp(self):
        ID = self.id_entry.get()
        
        #querry to select employee with the exact id
        sql="SELECT * FROM Employee WHERE id =%s"
        val=(ID,)
        mycursor.execute(sql,val)
        myresult = mycursor.fetchall()
        
        # gets the number of rows affected by the command executed
        row_count = mycursor.rowcount
        # check if the id already exists
        if row_count == 0:
            tkinter.messagebox.showinfo('Response','This ID does not exist')
        else:
            #delete from employee for the specific id
            sql="DELETE FROM Employee WHERE id =%s"
            val=(ID,)
            mycursor.execute(sql,val)
            tkinter.messagebox.showinfo('Response',"Employee information deleted. ")
            
            #clear the entry
            self.name_entry.delete(0,'end')
            self.id_entry.delete(0,'end')
            self.dept_entry.delete(0,'end')
            self.title_entry.delete(0,'end')

    def quit(self):
        # Display an info dialog box.
        tkinter.messagebox.showinfo('Response','Thanks Good bye!')
        self.main_window.destroy()

# Call the main function.
# Create an instance of the emp class.
employeemang = employe()

