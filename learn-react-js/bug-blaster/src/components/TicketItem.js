import React from 'react';

export default function TicketItem({ticket, dispach}){
 
    //create obj with props. = make it equal to passed ticket:
    const {id, title, description, priority} = ticket;

    const priorityClass = {
        1: "priority-low",
        2: "priority-medium",
        3: "priority-high"
    };

    //priority class is whatever number is in ticket.priority gets text priorityClass ++++
    return (
        <div className='ticket-item'>
            <div className={`priority-${priorityClass[ticket.priority]}`}></div>
            <h3>{title}</h3>
            <p>{description}</p>
        </div>
    );
};