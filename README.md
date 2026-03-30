# Social Spark App
**IMAD5112 – Introduction to Mobile Application Development**
**Student:** [Your Name] | **Student Number:** [Your Student Number]

## 1. Purpose of the App
I built the Social Spark app to solve a common modern problem: wanting to stay in touch with people but feeling too overwhelmed to figure out how to start. I designed this specifically with my friend Cora in mind, who struggles to maintain social connections during her busy workdays. 

The app acts as a low-stress prompt generator. By typing in the current time of day (like "Morning" or "Dinner"), the app uses `if/else` logic to instantly suggest a small, manageable social "spark." It removes the friction of deciding what to do, helping users stay connected with a simple tap.

## 2. Design Considerations
When building the user interface, my main goal was to keep it clean, calming, and easy to use so it wouldn't add to the user's daily stress.
* **Layout & Colours:** I used a standard, vertical `LinearLayout` so the flow feels natural from top to bottom. I chose a calming color palette featuring soft blues (like `#7ABAE2`) and a light grey background (`#FAFAFA`) to make the app feel friendly rather than clinical.
* **User Experience (UX):** To make the app intuitive, I included helper text right below the title to explain exactly what the user needs to type. I also added a "Clear" button so they don't have to manually backspace to try a new time.
* **Error Handling:** I wanted the app to be robust, so I added specific error handling. If the user leaves the text box empty or types a time the app doesn't recognize, it doesn't crash. Instead, it displays a polite, motivating message guiding them to try standard inputs like "Afternoon". 

## 3. GitHub and Version Control
I utilized Git and GitHub throughout the development process to safely track my project's history. Instead of uploading everything at the very end, I made sure to push my code using descriptive commit messages (e.g., committing the UI layout first, then adding the logic bindings later). This allowed me to maintain a clean timeline of my development process.

## 4. GitHub Actions (Automated Building)
To ensure my code is stable and compiles correctly outside of my own computer, I implemented automated testing using GitHub Actions. I set up a `build.yml` workflow file inside the `.github/workflows` directory. Now, every time I push an update to the `main` branch, GitHub automatically provisions a server and runs a Gradle build. This acts as an automated quality check to ensure no fatal errors were introduced.

## 5. Video Demonstration
Click the link below to watch a full demonstration of the app running on an Android emulator, including a walkthrough of the code logic and error handling:

🎥 **Watch the App Demo:** https://youtu.be/kaMG_TMsnDE

---

## ## 6. App Screenshots

**Home Screen Interface:**
*(Shows the clean, user-friendly initial state)*
![Home Screen](Screenshot%202026-03-30%20193355.png)

**Successful Social Suggestion:**
*(Shows the app successfully returning a prompt based on 'morning' input)*
![Suggestion Displayed](Screenshot%202026-03-30%20193414.png)

**Error Handling - Empty Input:**
*(Shows the app catching a blank submission and guiding the user)*
![Empty Input Error](Screenshot%202026-03-30%20193440.png)

**Error Handling - Unrecognized Input:**
*(Shows the app gracefully handling a time of day it doesn't recognize)*
![Unrecognized Input Error](Screenshot%202026-03-30%20193459.png)
---

## 7. References
Android Developer Documentation. (2024). Build your first app. Retrieved from https://developer.android.com/training/basics/firstapp
Kotlin Documentation. (2024). Kotlin language documentation. Retrieved from https://kotlinlang.org/docs/home.html
GitHub Actions Documentation. (2024). GitHub Actions quickstart. Retrieved from https://docs.github.com/en/actions/quickstart
IMAD5112 GitHub Actions Reference Workflow. Retrieved from https://github.com/IMAD5112/github-actions/blob/main/.github/workflows/build.yml
Google. (2024). CardView overview. Android Developers. Retrieved from https://developer.android.com/guide/topics/ui/layout/cardview
