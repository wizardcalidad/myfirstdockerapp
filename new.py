from flask import Flask

app = Flask(__name__)

@app.route("/")
def hello_world():
    return "<p>Hello, World!, Qoyum is coming to rule, get ready!</p>"

@app.route("/about")
def about_us():
    return "<p>This page does not support peace, i want violence!</p>"

@app.route("/olobe")
def aisha_olobe():
    return "<p>This Aisha Sanusi yaro girl is not serious!</p>"
