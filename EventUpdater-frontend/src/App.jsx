import { useEffect, useState } from 'react'


function App() {
  const [message, setMessage] = useState("")
  useEffect(()=>{
    fetch("http://localhost:8080/test").
    then((data)=>data.text()).
    then((data)=>setMessage(data)).
    catch((error)=>console.log(error))
  })
  return (
    <>
      <h1>{message}</h1>
    </>
  )
}

export default App
