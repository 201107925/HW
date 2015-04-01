<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Hifz Tracker</title>
    <link href="../../Documents/yj/YJ/QU/Enterprise/hw2/homework2/css/styles.css" rel="stylesheet">
</head>

<body>
    <header>
        <div class="header">
            <img src="../../Documents/yj/YJ/QU/Enterprise/hw2/homework2/img/logo.png" alt="Hifz Tracker Logo">
            <h1>Hifz Tracker</h1>
            <span>Welcome Samir Farhan (<a href="login.html">logout</a>)</span>
        </div>
        <nav>
            <ul>
                <li><a href="index.html">Pending</a></li>
                <li><a href="completed.html">Completed</a></li>
                <li><a href="add-task.html">Add Task</a></li>
            </ul>
        </nav>
    </header>

    <section>
        <h2>Update Task</h2>
        <form>

            <label for="sura">Sura</label>
            <!--More info about custom data attributes @ http://www.w3schools.com/tags/att_global_data.asp-->
            <select name="sura" id="sura" required>
                <option value=""></option>
                <option value="1" data-ayaCount="7"> 1. Al-Fatiha (7 Aya)</option>
                <option value="2" data-ayacount="286" selected> 2. Al-Baqara (286 Aya)</option>
                <option value="3" data-ayacount="200"> 3. Aal-e-Imran (200 Aya)</option>
                <option value="4" data-ayacount="176"> 4. An-Nisa (176 Aya)</option>
                <option value="5" data-ayacount="120"> 5. Al-Maeda (120 Aya)</option>
                <option value="6" data-ayacount="165"> 6. Al-Anaam (165 Aya)</option>
                <option value="7" data-ayacount="206"> 7. Al-Araf (206 Aya)</option>
                <option value="8" data-ayacount="75"> 8. Al-Anfal (75 Aya)</option>
            </select>
            <br />

            <div class="range-selector">
                <label for="fromAya">From Aya: 
                    <output id="selectedFromAya" for="fromAya">100</output>
                </label>
                <input type="range" id="fromAya" name="fromAya"
                       min="1" max="286" value="100"
                       oninput="selectedFromAya.value = fromAya.value;">
            </div>

            <div class="range-selector">
                <label for="toAya">To Aya: 
                    <output id="selectedToAya" for="toAya">105</output>
                </label>
                <input type="range" id="toAya" name="toAya"
                       min="1" max="286" value="105"
                       oninput="selectedToAya.value = toAya.value;">
            </div>
            <br>

            <label for="dueDate">Due Date</label>
            <input id="dueDate" name="dueDate" type="date" required value="2015-03-22"/>

            <label>Task Type</label>
            <label>
                <input type="radio" id="memorization" name="type" value="memorization" checked required> Memorization
            </label>

            <label>
                <input type="radio" id="revision" name="type" value="revision"> Revision
            </label>
            <br />
            <input type="submit" value="Submit">

        </form>
    </section>

</body>
</html>
