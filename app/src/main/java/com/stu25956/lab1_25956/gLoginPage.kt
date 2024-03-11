package com.stu25956.lab1_25956

/*
Mobile App 1 - BSC20923
Filipe Lutz Mariano 25956
Continuous Assessment 1 (10%)
*/

// import libraries
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Composable function to display the top part
@Composable
fun topPart() {
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

    // Welcome message
    Text(
        text = "Welcome back. you've been missed!",
        fontSize = 17.sp,
        color = Gray
    )
}

// Composable function to display the login box
@Composable
fun myLoginBox() {
    // Create a Box to contain login components
    Box(modifier = Modifier
        .height(140.dp)
        .width(320.dp)
        .background(Color.Transparent)
    ) {
        // Column layout to arrange login components vertically
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
                    .height(60.dp),
                textStyle = TextStyle(fontSize = 16.sp),
                value = "Email",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = White,
                    unfocusedContainerColor = White,
                    disabledContainerColor = White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedTextColor = LightBlack,
                    unfocusedTextColor = Gray),
                shape = RoundedCornerShape(10)
            )

            // Password text field
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                textStyle = TextStyle(fontSize = 16.sp),
                value = "Password",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = White,
                    unfocusedContainerColor = White,
                    disabledContainerColor = White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedTextColor = LightBlack,
                    unfocusedTextColor = Gray),
                shape = RoundedCornerShape(10)
            )
        }
    }

    // Spacing below the login box
    Spacer(modifier = Modifier.height(6.dp))

    // Display "Forgot Password?" text
    Text(
        modifier = Modifier
            .padding(
                bottom = 20.dp,
                start = 185.dp),
        text = "Forgot Password?",
        fontSize = 16.sp,
        color = LightBlack,
        fontWeight = FontWeight.SemiBold
    )
}

// Composable function to display the button part
@Composable
fun buttonPart() {
    // Row layout to arrange the button horizontally
    Row(
        modifier = Modifier
            .padding(10.dp)
            .width(320.dp),
    ) {
        // Login button
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .background(White,
                    shape = RoundedCornerShape(10))
                .weight(1f)
                .height(70.dp),
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = White,
                contentColor = LightBlack),
        ) {
            Text(
                text = "Login",
                fontSize = 18.sp,
                color = Black,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

// Composable function to display the bottom part
@Composable
fun bottomPart() {
    // Column layout to arrange elements vertically
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
    ) {
        // Row layout to display divider and text
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .width(320.dp)
        ) {
            // Text divider
            Text(
                text = "------------------------",
                color = White
            )

            // Text
            Text(
                text = "Or continue with",
                fontSize = 17.sp,
                color = Gray
            )

            // Text divider
            Text(
                text = "------------------------",
                color = White
            )
        }

        // Spacing
        Spacer(modifier = Modifier.height(20.dp))

        // Row layout to display social login icons
        Row {
            // Google login icon box
            Box {
                val googleIcon = painterResource(id = R.drawable.google)
                Image(
                    painter = googleIcon,
                    contentDescription = "googleIcon",
                    modifier = Modifier
                        .height(70.dp)
                        .width(70.dp)
                        .background( White,
                            shape = RoundedCornerShape(20))
                        .padding(20.dp)
                )
            }

            // Spacing between icons
            Spacer(modifier = Modifier.width(25.dp))

            // Apple login icon box
            Box {
                val appleIcon = painterResource(id = R.drawable.apple)
                Image(
                    painter = appleIcon,
                    contentDescription = "googleIcon",
                    modifier = Modifier
                        .height(70.dp)
                        .width(70.dp)
                        .background(White,
                            shape = RoundedCornerShape(20))
                        .padding(20.dp)
                )
            }
        }

        // Spacing
        Spacer(modifier = Modifier.height(30.dp))

        // Row layout to display "Not a member?" and "Register now" text
        Row {
            // Display "Not a member?" text
            Text(
                text = "Not a member?",
                fontSize = 17.sp,
                color = Gray,
                fontWeight = FontWeight.SemiBold
            )

            // Spacing
            Spacer(modifier = Modifier.width(5.dp))

            // Display "Register now" text
            Text(
                text = "Register now",
                fontSize = 17.sp,
                color = LightBlack,
                fontWeight = FontWeight.Bold
            )
        }
    }

    // Spacing
    Spacer(modifier = Modifier.height(20.dp))
}

// Composable function to display the gray login page
@Composable
fun gLogin() {
    // Surface layout to provide background color
    Surface(
        color = LightGray,
    ) {
        // Column layout to arrange elements vertically
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxSize(),
        ) {
            // Display top part
            topPart()

            // Column layout to arrange elements vertically
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
            ) {
                // Display middle part
                myLoginBox()

                // Display button part
                buttonPart()
            }

            // Display bottom part
            bottomPart()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun gLoginPreview() {
    gLogin()
}