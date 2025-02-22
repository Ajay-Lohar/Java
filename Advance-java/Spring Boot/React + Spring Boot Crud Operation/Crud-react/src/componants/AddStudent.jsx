import axios from 'axios';
import React, { useState } from 'react'
import Form from 'react-bootstrap/Form';
import Home from './Home';


const AddStudent = () => {
    const [formData, setFormData] = useState({
        id : '',
        name : '',
        age : '',
        dept : ''
});
    const handleChange=(e)=>{
        const {name,value} = e.target;
        setFormData({...formData,[name]:value});
    }

    const handleSubmit=async(e)=>{
        e.preventDefault();
        console.log(formData);
        const response = await axios.post( "http://localhost:8082/addStudent",formData)
        .then(
            alert("Student added successfully")
        ).catch(
            alert("Error adding student")
        )
    }
    return (
        <>
        
            <div>AddStudent</div>
            <Form onSubmit={handleSubmit}>
                {/* <Form.Group className="mb-3" >
                    <Form.Label>Id</Form.Label>
                    <Form.Control type="text" placeholder="id" name='id' onChange={handleChange} />
                </Form.Group>  it is Not Working  For Primary key & Auto-increment allocate in database */}
                <br /> <br />
                <Form.Group className="mb-3" >
                    <Form.Label>Name</Form.Label>
                    <Form.Control type="text" placeholder='Enter Your Name' name='name' onChange={handleChange} />
                </Form.Group>
                <br /> <br />
                <Form.Group className="mb-3" >
                    <Form.Label>Age</Form.Label>
                    <Form.Control type="text" placeholder='Enter Your Age' name='age' onChange={handleChange}/>
                </Form.Group>
                <br /> <br />
                <Form.Group className="mb-3" >
                    <Form.Label>Department</Form.Label>
                    <Form.Control type="text" placeholder='Enter Your Department' name='dept' onChange={handleChange}/>
                </Form.Group>
                <br /> <br />
                <Form.Group className="mb-3" >
                    <Form.Control type="submit" value='Submit' />
                </Form.Group>
            </Form>
        </>
    )
}

export default AddStudent