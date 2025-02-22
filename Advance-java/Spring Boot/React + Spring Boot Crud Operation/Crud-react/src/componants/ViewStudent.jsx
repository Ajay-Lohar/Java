import axios from 'axios';
import React, { useEffect, useState } from 'react'
import Form from 'react-bootstrap/Form';

const ViewStudent = () => {
    const [selectedStudent ,setSelectedStudent] =useState({
        id : '',
        name : '',
        age : '',
        dept : ''
     }) ;
    const [student ,setStudent] = useState([]) ;
    const [isFormOpen ,setFormOpen] = useState(false) ;

    useEffect(()=>{
        fetchStudent()
    },[]);

    const fetchStudent = async()=>{
       const baseURL = `http://localhost:8082/getStudents` ;
       const response  = await axios.get(baseURL);
       setStudent(response.data);
    };

    const deleteStudent = async(id)=>{
       const baseURL = `http://localhost:8082/deleteStudent/` + id ;
       await axios.get(baseURL);
       fetchStudent();
    };
    
    const handleUpdate = (student)=>{
        setSelectedStudent(student);
        setFormOpen(true);

    };

    const handleChange = (e)=>{

        const {name , value} = e.target;
        setSelectedStudent({...selectedStudent,[name]: value}) 
        
    }

    const updateStudent = async(id)=>{

        // const baseURL = `http://localhost:8082/updateStudent/` + id ;
        // await axios.put(baseURL,selectedStudent);
        // fetchStudent();
        // setFormOpen(false);

        const baseURL = `http://localhost:8082/updateStudent`;
        const  responce = await axios.post(baseURL, selectedStudent);
        fetchStudent();
        setFormOpen(false);
    };


  return (  
    <>
    <div>Thise is Your Student </div>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
                <th>Department</th>
            </tr>
        </thead>
        <tbody>
            {student.map((student,index)=>(
                <tr key={index}>
                    <td>{student.id}</td>
                    <td>{student.name}</td>
                    <td>{student.age}</td>
                    <td>{student.dept}</td>

                    <th>{<button onClick={()=>deleteStudent(student.id)}>Delete</button>}</th>
                    <th>{<button onClick={()=>handleUpdate(student)}>Update</button>}</th>
                </tr>
            ))}
        </tbody>
    </table>
    
    {isFormOpen && <Form onSubmit={updateStudent}> 
                <Form.Group className="mb-3" >
                    <Form.Label>Id</Form.Label>
                    <Form.Control type="text" placeholder="id" name='id' value={selectedStudent.id} onChange={handleChange} />
                </Form.Group>  
                <br /> <br />
                <br /> <br />
                <Form.Group className="mb-3" >
                    <Form.Label>Name</Form.Label>
                    <Form.Control type="text" placeholder='Enter Your Name' name='name' value={selectedStudent.name} onChange={handleChange} />
                </Form.Group>
                <br /> <br />
                <br /> <br />
                <Form.Group className="mb-3" >
                    <Form.Label>Age</Form.Label>
                    <Form.Control type="text" placeholder='Enter Your Age' name='age' value={selectedStudent.age} onChange={handleChange}/>
                </Form.Group>
                <br /> <br />
                <br /> <br />
                <Form.Group className="mb-3" >
                    <Form.Label>Department</Form.Label>
                    <Form.Control type="text" placeholder='Enter Your Department' name='dept' value={selectedStudent.dept} onChange={handleChange}/>
                </Form.Group>
                <br /> <br />
                <br /> <br />
                <Form.Group className="mb-3" >
                    <Form.Control type="submit" value='Submit' />
                </Form.Group>
            </Form>}
    
    </>
  )
}

export default ViewStudent