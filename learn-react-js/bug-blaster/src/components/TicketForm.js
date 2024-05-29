import React, {useState} from 'React';

export default function TicketForm(){
    
    const priorityLabels = {
        1: 'Low',
        2: 'Medium',
        3: 'High'
    };

    //create states:
    const [title, setTitle] = useState('');
    const [description, setDescription] = useState('');
    const [priority, setPriority] = useState('1'); //default low priority

    const clearForm = ()=>{
        setTitle('');
        setDescription('');
        setPriority('1');
    };

    
    
    return(<></>);
};