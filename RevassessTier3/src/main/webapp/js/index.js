/**
 * return the object returned from the api
 * in this function. 
 * the url for the api is:
 *  http://ec2-3-19-123-54.us-east-2.compute.amazonaws.com:9999/flashcard
 */
let resp;
async function callFlashcardApi(){
    const o = await fetch("http://ec2-3-19-123-54.us-east-2.compute.amazonaws.com:9999/flashcard");
    const i = await o.json();
    console.log(i);
    resp = i;
    return i;
}

/**
 * manipulate the dom with this function
 */
function manipDom(){
    document.getElementById('cardId').innerHTML=1;
    document.getElementById('cardQstn').innerHTML="core java question";
    document.getElementById('cardCat').innerHTML='core java';
    document.getElementById('cardAns').innerHTML='dummy answer';
    console.log("this function ran");
}

function getResp(){
    return resp;
}