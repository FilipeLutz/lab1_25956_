package com.stu25956.lab1_25956

/*
Mobile App 1 - BSC20923
Filipe Lutz Mariano 25956
Continuous Assessment 1 (10%)
*/

// import libraries
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Composable function to display the top part
@Composable
fun toPart() {
    // Load icon for display
    val icon = painterResource(id = R.drawable.lock)

    // Spacing above the image
    Spacer(modifier = Modifier.height(30.dp))

    // Image icon
    Image(
        painter = icon,
        contentDescription = "Icon",
        modifier = Modifier
            .height(100.dp)
            .width(120.dp)
    )

    // Spacing below the image
    Spacer(modifier = Modifier.height(10.dp))

    // Message for creating an account
    Text(
        text = "Let's create an account for you",
        fontSize = 18.sp,
        color = Gray,
        fontWeight = FontWeight.SemiBold
    )
}

// Composable function to display the sign-up box
@Composable
fun mySignUpBox() {
    // Create a Box to contain sign-up components
    Box(modifier = Modifier
        .height(215.dp)
        .width(320.dp)
        .background(Transparent)
    ){
        // Column layout to arrange sign-up components vertically
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            // Email text field
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .border(BorderStroke(3.dp, White),
                        shape = RoundedCornerShape(10)),
                textStyle = TextStyle(fontSize = 16.sp),
                value = "Email",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = ConWhite,
                    unfocusedContainerColor = ConWhite,
                    disabledContainerColor = ConWhite,
                    focusedIndicatorColor = Transparent,
                    unfocusedIndicatorColor = Transparent,
                    focusedTextColor = LightBlack,
                    unfocusedTextColor = Gray),
                shape = RoundedCornerShape(10)
            )

            // Password text field
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .border(BorderStroke(3.dp, White),
                        shape = RoundedCornerShape(10)),
                textStyle = TextStyle(fontSize = 16.sp),
                value = "Password",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = ConWhite,
                    unfocusedContainerColor = ConWhite,
                    disabledContainerColor = ConWhite,
                    focusedIndicatorColor = Transparent,
                    unfocusedIndicatorColor = Transparent,
                    focusedTextColor = LightBlack,
                    unfocusedTextColor = Gray),
                shape = RoundedCornerShape(10)
            )

            // Confirm password text field
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .border(BorderStroke(3.dp, White),
                        shape = RoundedCornerShape(10)),
                textStyle = TextStyle(fontSize = 16.sp),
                value = "Confirm password",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = ConWhite,
                    unfocusedContainerColor = ConWhite,
                    disabledContainerColor = ConWhite,
                    focusedIndicatorColor = Transparent,
                    unfocusedIndicatorColor = Transparent,
                    focusedTextColor = LightBlack,
                    unfocusedTextColor = Gray),
                shape = RoundedCornerShape(10)
            )
        }
    }
}

// Composable function to display the sign-up button
@Composable
fun SignUpButton() {
    // Row layout to arrange the button horizontally
    Row(
        modifier = Modifier
            .padding(10.dp)
            .width(320.dp),
    ) {
        // Sign-up button
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .background(ConWhite,
                    shape = RoundedCornerShape(10))
                .weight(1f)
                .height(70.dp)
                .border(BorderStroke(3.dp, White),
                    shape = RoundedCornerShape(10)),
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = ConWhite,
                contentColor = LightBlack)
        ) {
            Text(
                text = "Sign Up",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

// Composable function to display the bottom part
@Composable
fun botPart() {
    // Row layout to arrange elements horizontally
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .width(240.dp),
    ){
        // Display "Already a member?" text
        Text(
            text = "Already a member?",
            fontSize = 17.sp,
            color = Gray,
            fontWeight = FontWeight.SemiBold
        )

        // Display "Login now" text
        Text(
            text = "Login now",
            fontSize = 17.sp,
            color = Black,
            fontWeight = FontWeight.Bold
        )
    }
}

// Composable function to display the gray sign-up page
@Composable
fun gSignUp() {
    // Surface layout to provide background color
    Surface(
        color = LightGray
    ) {
        // Column layout to arrange elements vertically
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxSize(),
        ) {
            // Spacing
            Spacer(modifier = Modifier.height(40.dp))

            // Display top part
            toPart()

            // Column layout to arrange elements vertically
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
            ) {
                // Display middle
                mySignUpBox()

                // Spacing
                Spacer(modifier = Modifier.height(10.dp))

                // Display sign-up button
                SignUpButton()
            }

            // Display bottom part
            botPart()

            // Spacing
            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun gSignUpPreview() {
    gSignUp()
}