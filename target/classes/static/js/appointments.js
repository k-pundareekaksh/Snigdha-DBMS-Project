fetch('http://localhost:8080/a')
            .then(res => {
                console.log(res);
                return res.json();
            }).then((objectData)=>{
                console.log(objectData);
                let tableData = "";
                objectData.map((values)=>{
                    tableData+= `
                    <div class="doctoritem">
                        <div id="doctordata" class="doctor">
                            <div>
                            <h4>Dr. ${values.name}</h4>
                            <h6>${values.department}</h6>
                            </div>
                            <div class="appprice">
                            <h6>${values.phone}</h6>
                            <h5>Rs ${values.fees}</h5>
                            <button>Book Appointment</button>
                            </div>
                        </div>
                    </div>
                    `
                });
                document.getElementById("doctordata").innerHTML=tableData;
            })