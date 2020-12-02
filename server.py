from flask import Flask,request, Response
app=Flask(__name__)


@app.route('/')
def wellcome():
    return "one for all & all for one"


port_numbers = 3000
if __name__ == "__main__":
    app.run(port=port_numbers)