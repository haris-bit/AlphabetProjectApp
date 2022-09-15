package com.example.alphabetproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayGameActivity extends AppCompatActivity {

    int currentQuestionIndex;
    int totalCorrect;
    int totalQuestions;
    ArrayList<Question> questions;

    ImageView questionImageView;
    TextView questionsRemainingTextView;
    Button answer0Button;
    Button answer1Button;
    Button answer2Button;
    Button answer3Button;
    Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);

        questionImageView = findViewById(R.id.iv_main_question_image);
        questionsRemainingTextView = findViewById(R.id.tv_main_questions_remaining_count);
        answer0Button = findViewById(R.id.btn_main_answer_0);
        answer1Button = findViewById(R.id.btn_main_answer_1);
        answer2Button = findViewById(R.id.btn_main_answer_2);
        answer3Button = findViewById(R.id.btn_main_answer_3);
        submitButton = findViewById(R.id.btn_main_submit_answer);


        answer0Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAnswerSelected(0);
            }
        });

        answer1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAnswerSelected(1);
            }
        });

        answer2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAnswerSelected(2);
            }
        });

        answer3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAnswerSelected(3);
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAnswerSubmission();
            }
        });

        startNewGame();
    }

    void displayQuestion(Question question) {
        questionImageView.setImageResource(question.imageId);
        answer0Button.setText(question.answer0);
        answer1Button.setText(question.answer1);
        answer2Button.setText(question.answer2);
        answer3Button.setText(question.answer3);
    }

    void displayQuestionsRemaining(int questionsRemaining) {
        questionsRemainingTextView.setText(String.valueOf(questionsRemaining));
    }

    void onAnswerSelected(int answerSelected) {

        // Recover the current Question
        Question currentQuestion = getCurrentQuestion();
        // Change the player's answer
        currentQuestion.playerAnswer = answerSelected;

        // Re-assign the text displayed by each answer Button to its original content
        answer0Button.setText(currentQuestion.answer0);
        answer1Button.setText(currentQuestion.answer1);
        answer2Button.setText(currentQuestion.answer2);
        answer3Button.setText(currentQuestion.answer3);


        // Indicate a selection
        switch (answerSelected) {
            case 0:
                answer0Button.setText("✔" + currentQuestion.answer0);
                break;
            case 1:
                answer1Button.setText("✔" + currentQuestion.answer1);
                break;
            case 2:
                answer2Button.setText("✔" + currentQuestion.answer2);
                break;
            case 3:
                answer3Button.setText("✔" + currentQuestion.answer3);
                break;
        }

    }
    void onAnswerSubmission() {
        Question currentQuestion = getCurrentQuestion();
        if (currentQuestion.isCorrect()) {
            totalCorrect = totalCorrect + 1;
        }
        questions.remove(currentQuestion);

        displayQuestionsRemaining(questions.size());

        if (questions.size() == 0) {
            String gameOverMessage = getGameOverMessage(totalCorrect, totalQuestions);

            AlertDialog.Builder gameOverDialogBuilder = new AlertDialog.Builder(PlayGameActivity.this);
            gameOverDialogBuilder.setCancelable(false);
            gameOverDialogBuilder.setTitle("Game Over!");
            gameOverDialogBuilder.setMessage(gameOverMessage);
            gameOverDialogBuilder.setPositiveButton("Play Again!", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    startNewGame();
                }
            });
            gameOverDialogBuilder.create().show();
        } else {
            chooseNewQuestion();

            displayQuestion(getCurrentQuestion());
        }
    }

    void startNewGame() {
        questions = new ArrayList<>();

        Question question0 = new Question(R.drawable.a4_update, "A", "F", "K", "Q", 0);
        Question question1 = new Question(R.drawable.d4_update, "L", "Q", "T", "D", 3);
        Question question2 = new Question(R.drawable.h2_update, "P", "H", "D", "R", 1);
        Question question3 = new Question(R.drawable.j1_update, "C", "E", "I", "J", 3);
        Question question4 = new Question(R.drawable.l4_update,"G", "J", "L", "O", 2);
        Question question5 = new Question(R.drawable.o3_update, "O", "S", "X", "Y", 0);
        Question question6 = new Question(R.drawable.q5_update, "P", "Q", "T", "V", 1);
        Question question7 = new Question(R.drawable.s4_update, "E", "K", "S", "Z", 2);
        Question question8 = new Question(R.drawable.u3_update, "L", "M", "R", "U", 3);
        Question question9 = new Question(R.drawable.w2_update, "B", "M", "P", "W", 3);
        Question question10 = new Question(R.drawable.x5_update, "Q", "X", "R", "V", 1);
        Question question11 = new Question(R.drawable.z4_update, "P", "W", "Z", "C", 2);
        Question question12 = new Question(R.drawable.k3_update, "G", "C", "K", "M", 2);
        questions.add(question0);
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        questions.add(question8);
        questions.add(question9);
        questions.add(question10);
        questions.add(question11);
        questions.add(question12);


        while (questions.size() > 6) {
            int questionIndexToRemove = generateRandomNumber(questions.size());
            questions.remove(questionIndexToRemove);
        }

        totalCorrect = 0;
        totalQuestions = questions.size();

        Question firstQuestion = chooseNewQuestion();

        displayQuestionsRemaining(questions.size());

        displayQuestion(firstQuestion);
    }

    Question chooseNewQuestion() {
        int newQuestionIndex = generateRandomNumber(questions.size());
        currentQuestionIndex = newQuestionIndex;
        return questions.get(currentQuestionIndex);
    }

    int generateRandomNumber(int max) {
        double randomNumber = Math.random();
        double result = max * randomNumber;
        return (int) result;
    }

    Question getCurrentQuestion() {
        Question currentQuestion = questions.get(currentQuestionIndex);
        return currentQuestion;
    }

    String getGameOverMessage(int totalCorrect, int totalQuestions) {
        if (totalCorrect == totalQuestions) {
            return "You got all " + totalQuestions + " right! You won!";
        } else {
            return "You got " + totalCorrect + " right out of " + totalQuestions + ". Better luck next time!";
        }
    }
}