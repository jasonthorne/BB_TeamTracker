import './Card.css'; 

function Card(props){

    const classes = 'card ' + props.className; //add 'card' along with already defined class name as classes

    //++++++++++++++++++++++++++++++++++++++++++++++++IMPORTANT :P
    //props.children DOESNT need passed to the component
    //it sets all child items within card to be returned, and displayed 
    return <div className={classes}>{props.children}</div>;
}

export default Card;