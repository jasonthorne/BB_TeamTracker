
//state is the current tickets available
//'action' is what you want to do (add, delete etc)
//action has 2 information types:
//action type (what do you want to do - add, delete etc)
//and a payload (what info do you need inorder to do that)
export default function ticketReducer(state, action){
    
    switch(action.type){
        case "ADD_TICKET":
            return{}
        default:
            return state; //if nothing is true, then just return the current state
    }


}