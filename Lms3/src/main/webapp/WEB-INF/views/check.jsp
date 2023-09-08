<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>MSB Bank</title>
    <!-- Include Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <!-- Include Bootstrap JS (optional) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        .header {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 10px;
            position: relative;
        }

        .header button {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 5px 10px;
            cursor: pointer;
            position: absolute;
            top: 10px;
        }

        .container {
            padding: 20px;
        }

        .form-group {
            margin-bottom: 20px;
        }

        .form-container {
            max-width: 300px;
            padding: 10px;
            background-color: white;
            margin: 0 auto;
        }

        /* Additional styling for your eligibility check section */
        #eligibility {
            margin-top: 30px;
            padding: 20px;
            border: 1px solid #ccc;
            background-color: #fff;
            border-radius: 5px;
        }
    </style>
</head>

<body>
    <div class="header bg-dark text-white py-3">
        <h1 class="text-center">MSB Bank</h1>
    </div>
	<form action="proceed">
    <div class="container">
        <div class="form-container">
            <h1>Check Eligibility</h1>
            <div class="form-group">
                <label for="ab">Loan Amount Required:</label>
                <input type="text" id="ab" name="amount" class="form-control">
            </div>
            <div class="form-group">
                <label for="cd">Annual Income:</label>
                <input type="text" id="cd" class="form-control">
            </div>
            <div class="form-group">
                <label for="ef">Disposable Income:</label>
                <input type="text" id="ef" class="form-control">
            </div>
            <div class="form-group">
                <label for="gh">Cibil Score:</label>
                <input type="text" id="gh"  name="cibil" class="form-control">
            </div>
            <button type="button" class="btn btn-primary" id="id1" onclick="calculate()">Check Eligibility</button>
            
            <div id="eligibility">
                <div id="id2"></div>
                <div id="id3"></div>
            </div>
           
        </div>
    </div>
 </form>
    <script>
        function calculate() {
            var a = parseFloat(document.getElementById("ab").value);
            var b = parseFloat(document.getElementById("ef").value);

            if (isNaN(a) || isNaN(b)) {
                // Handle invalid input
                alert("Please enter valid numbers for Loan Amount Required and Disposable Income.");
                return;
            }

            var c = (a / b) / 12;
            var d = (a * c * 0.6) / 100;
            var e = d + a;
            document.getElementById("id2").textContent = "Number Of Years: " + c.toFixed(3);
            document.getElementById("id3").textContent = "Repayable Amount: " + e.toFixed(2);
        
            var but=document.createElement("button");
            but.textContent="Proceed";
            document.getElementById("eligibility").appendChild(but);
        }
    </script>
</body>

</html>
