package Lesson_2.complexNumbers;

public class ComplexNumber {
    double Re;
    double Im;

    public ComplexNumber(double Re){
        this.Re = Re;
        this.Im = 0;
    }

    public ComplexNumber(double Re, double Im){
        this.Re = Re;
        this.Im = Im;
    }

    public ComplexNumber add (ComplexNumber complexNumber){
        return new ComplexNumber(this.Re + complexNumber.Re, this.Im + complexNumber.Im);
    }

    public ComplexNumber subtract (ComplexNumber complexNumber){
        return new ComplexNumber(this.Re - complexNumber.Re, this.Im - complexNumber.Im);
    }

    public ComplexNumber multiply (ComplexNumber complexNumber){
        return new ComplexNumber((this.Re * complexNumber.Re - this.Im * complexNumber.Im),
                (this.Im * complexNumber.Re + this.Re * complexNumber.Im));
    }

    public double abs (){
        return Math.sqrt(this.Re * this.Re + this.Im * this.Im);
    }

    @Override
    public String toString() {
        String resultString;

        if(this.Re == 0 && this.Im == 0) {
            resultString = "0";
        }else if(this.Re == 0){
            resultString = this.Im +"i";
        }else if(this.Im == 0){
            resultString = "" + this.Re;
        }else if(this.Im < 0){
            resultString = "" + this.Re + this.Im + "i";
        }else{
            resultString = "" + this.Re + "+" + this.Im + "i";
        }
        return resultString;
    }
}
