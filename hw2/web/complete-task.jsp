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
        <h2>Complete Task</h2>
        <table>
            <thead>
                <tr>
                    <th>Sura</th>
                    <th>Ayats</th>
                    <th>Due Date</th>
                    <th>Type</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Al-Fatihah</td>
                    <td>1 to 7</td>
                    <td>30-4-2015</td>
                    <td>Memorize</td>
                </tr>
            </tbody>
        </table>
        <br />

        <form>
            <label for="">Hifz level</label>
            <label>
                <input type="radio" name="level" value="excellent"> Excellent
            </label>
            <label>
                <input type="radio" name="level" value="ok"> Ok
            </label>
            <label>
                <input type="radio" name="level" value="poor" required> Poor
            </label>
            <br />
            <label>Completed date
                <input id="completeDate" name="completeDate" type="date" required />
            </label>
            <label>Comments
                <textarea id="comment" name="comment"></textarea>
            </label>
            <input type="submit" value="Submit">
        </form>
    </section>

</body>
</html>
