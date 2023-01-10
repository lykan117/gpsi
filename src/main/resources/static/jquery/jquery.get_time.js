var serverTime = new Date();
function updateTime() {
    serverTime = new Date(serverTime.getTime() + 1000);
    var time = 
        pad(serverTime.getHours())       + ":" + 
        pad(serverTime.getMinutes())     + ":" + 
        pad(serverTime.getSeconds())     + " " + 
        pad(serverTime.getUTCDate())     + "-" + 
        pad(serverTime.getUTCMonth()+1)  + "-" + 
        pad(serverTime.getUTCFullYear());
    $('.time').html(time);

     var time1=pad(serverTime.getMinutes())     + ":" + 
               pad(serverTime.getSeconds());
            //  if (time1=="00:00"||time1=="30:00") 
            //  {
             //   location.reload(true);
             // }
    function pad(n){return n<10 ? '0'+n : n}


}

$(function() {
    updateTime();
    setInterval(updateTime, 1000);
});