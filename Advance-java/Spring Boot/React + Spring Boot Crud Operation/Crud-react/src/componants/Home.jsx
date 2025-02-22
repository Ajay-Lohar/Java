import React from 'react'
import { Link } from 'react-router-dom'
import ListGroup from 'react-bootstrap/ListGroup';

const Home = () => {
  return (
    <>
    <h1>Home</h1>
   
    <ListGroup>
      <ListGroup.Item disabled><Link style={{textDecoration:"none"}} to={`/AddStudent`}>Add Student</Link></ListGroup.Item><br/><br/>
      <ListGroup.Item><Link style={{textDecoration:"none"}} to={`/ViewStudents`}> View Student List </Link></ListGroup.Item>
    </ListGroup>
          
    </>

  )
}

export default Home