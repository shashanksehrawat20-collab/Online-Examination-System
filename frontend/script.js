/* ===================================================
   SAVOIR ONLINE EXAMINATION SYSTEM
   script.js
=================================================== */

document.addEventListener("DOMContentLoaded", function () {

    console.log("Savoir Online Examination System Loaded");

    initializeNavigation();
    initializeLoginButtons();
    initializeExamButtons();
    initializeAnimations();

});



/* ===========================================
   NAVIGATION
=========================================== */

function initializeNavigation() {

    const links = document.querySelectorAll("nav a");

    links.forEach(link => {

        link.addEventListener("mouseenter", function () {

            this.style.transition = "0.3s";

        });

    });

}



/* ===========================================
   LOGIN BUTTONS
=========================================== */

function initializeLoginButtons() {

    const studentButton = document.querySelector(".student-btn");

    if (studentButton) {

        studentButton.addEventListener("click", function () {

            console.log("Opening Student Login");

        });

    }

    const adminButton = document.querySelector(".admin-btn");

    if (adminButton) {

        adminButton.addEventListener("click", function () {

            console.log("Opening Admin Login");

        });

    }

}



/* ===========================================
   EXAM BUTTONS
=========================================== */

function initializeExamButtons() {

    const buttons = document.querySelectorAll(".primary-btn");

    buttons.forEach(button => {

        button.addEventListener("click", function () {

            console.log("Button Clicked");

        });

    });

}



/* ===========================================
   SIMPLE ANIMATIONS
=========================================== */

function initializeAnimations() {

    const cards = document.querySelectorAll(

        ".feature-card, .dashboard-card, .stat-card, .step"

    );

    cards.forEach(card => {

        card.addEventListener("mouseenter", function () {

            this.style.transform = "translateY(-8px)";

        });

        card.addEventListener("mouseleave", function () {

            this.style.transform = "translateY(0px)";

        });

    });

}
/* ===========================================
   EXAM TIMER
=========================================== */

let examDuration = 90 * 60;

let timerInterval = null;

function startExamTimer() {

    const timer = document.getElementById("timer");

    if (!timer) return;

    timerInterval = setInterval(function () {

        const minutes = Math.floor(examDuration / 60);

        const seconds = examDuration % 60;

        timer.textContent =
            String(minutes).padStart(2, "0") +
            ":" +
            String(seconds).padStart(2, "0");

        if (examDuration <= 0) {

            clearInterval(timerInterval);

            alert("Time is over. Your exam has been submitted.");

        }

        examDuration--;

    }, 1000);

}



/* ===========================================
   QUESTION NAVIGATION
=========================================== */

let currentQuestion = 1;

function nextQuestion() {

    currentQuestion++;

    console.log("Current Question:", currentQuestion);

}

function previousQuestion() {

    if (currentQuestion > 1) {

        currentQuestion--;

    }

    console.log("Current Question:", currentQuestion);

}



/* ===========================================
   ANSWER SELECTION
=========================================== */

const selectedAnswers = {};

function selectAnswer(questionNumber, option) {

    selectedAnswers[questionNumber] = option;

    localStorage.setItem(

        "selectedAnswers",

        JSON.stringify(selectedAnswers)

    );

    console.log(selectedAnswers);

}



/* ===========================================
   RESTORE SAVED ANSWERS
=========================================== */

function loadSavedAnswers() {

    const saved = localStorage.getItem("selectedAnswers");

    if (!saved) return;

    const answers = JSON.parse(saved);

    Object.assign(selectedAnswers, answers);

}



/* ===========================================
   PROGRESS BAR
=========================================== */

function updateProgress(totalQuestions) {

    const progress = document.getElementById("progress");

    if (!progress) return;

    const answered = Object.keys(selectedAnswers).length;

    const percentage = (answered / totalQuestions) * 100;

    progress.style.width = percentage + "%";

}



/* ===========================================
   SUBMIT EXAM
=========================================== */

function submitExam() {

    const confirmSubmit = confirm(

        "Are you sure you want to submit the examination?"

    );

    if (!confirmSubmit) return;

    clearInterval(timerInterval);

    localStorage.removeItem("selectedAnswers");

    alert("Exam Submitted Successfully.");

}



/* ===========================================
   PAGE INITIALIZATION
=========================================== */

window.onload = function () {

    loadSavedAnswers();

    startExamTimer();

};