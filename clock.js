
function updateclock(){
    const date=new Date();
    const hour=date.getHours().toString().padStart(2,0);
    const e=hour>=12?"PM":"AM";
    const min=date.getMinutes().toString().padStart(2,0);
    const sec=date.getSeconds().toString().padStart(2,0);
    const time=`${hour}:${min}:${sec} ${e}`;
    document.getElementById("clock").textContent=time;
}
updateclock();
setInterval(updateclock,1000);