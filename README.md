# Material Buttons in Jetpack Compose

This repository demonstrates the implementation of various Material Buttons using Jetpack Compose in an Android application. The examples include Normal Button, Elevated Button, FilledTonal Button, Outlined Button, and Text Button.

## Features

- **Normal Button**
- **Elevated/Shadow Button**
- **FilledTonal Button**
- **Outlined Button**
- **Text Button**

Each button showcases different Material Design styles and behaviors.

## Implementation

### 1. Normal Button

```kotlin
Button(
    colors = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = Color.White
    ),
    enabled = true,
    onClick = {
        Toast.makeText(context, "Normal Button", Toast.LENGTH_SHORT).show()
    }
) {
    Text(
        text = "Normal Button"
    )
}
```

### 2. Elevated/Shadow Button

```kotlin
ElevatedButton(
    onClick = {
        Toast.makeText(context, "Elevated Button", Toast.LENGTH_SHORT).show()
    }
) {
    Icon(
        imageVector = Icons.Outlined.Add,
        contentDescription = "Add",
        modifier = Modifier.size(18.dp)
    )
    Spacer(modifier = Modifier.width(8.dp))
    Text(
        text = "Add to cart"
    )
}
```

### 3. FilledTonal Button

```kotlin
FilledTonalButton(onClick = {
    Toast.makeText(context, "Filled Button", Toast.LENGTH_SHORT).show()
}) {
    Text(text = "Open in browser")
}
```

### 4. Outlined Button

```kotlin
OutlinedButton(onClick = {
    Toast.makeText(context, "Outlined Button", Toast.LENGTH_SHORT).show()
}) {
    Text(text = "Back")
}
```

### 5. Text Button

```kotlin
TextButton(onClick = {
    Toast.makeText(context, "Text Button", Toast.LENGTH_SHORT).show()
}) {
    Text(text = "Learn more")
}
```

## Getting Started

1. Clone the repository:

```bash
git clone https://github.com/Bhavyansh03-tech/Material3_Buttons.git
```

2. Open the project in Android Studio.
3. Build and run the app on your Android device or emulator.

## Screenshots

<img src="https://github.com/Bhavyansh03-tech/Material3_Buttons/assets/96388594/d9c3851a-3edf-4d0f-9948-9966b8033bc8" alt="Second Flow Row" style="width: 200px; height: auto;">


## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

1.> Fork the Project.\
2.> Create your Feature Branch `git checkout -b feature/AmazingFeature`.\
3.> Commit your Changes `git commit -m 'Add some AmazingFeature'`.\
4.> Push to the Branch `git push origin feature/AmazingFeature`.\
5.> Open a Pull Request

## Acknowledgements

- Inspiration from various Android development tutorials and documentation.
## Contact

For questions or feedback, please contact [@Bhavyansh03-tech](https://github.com/Bhavyansh03-tech).
