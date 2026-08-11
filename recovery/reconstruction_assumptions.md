# Reconstruction Assumptions Log

This document records visual layouts, styles, and behavioral specifications that are inferred or speculated for the reconstruction of the original Pulze application, since they cannot be directly decompiled from the machine-code AOT binary.

## Stage 1: Onboarding Screen
* **Onboarding Screen -> LoginScreen Flow**: Classified as **STRONG INFERENCE** (the transition from Onboarding Screen to Login Screen is a logical flow supported by the existence of `_finishOnboarding` transitioning to the class `LoginScreen`, but the exact widget transition route is not directly decompilabe).
* **completed_onboarding SharedPreferences Key**: Classified as **ASSUMPTION / STRONG INFERENCE** (the standard `shared_preferences` dependency exists in the original plugins and `completed_onboarding` is a logical name used in the mock code, but the exact string `completed_onboarding` was not directly recovered in the binary bytes).
* **Exact Layout Alignments**: Inferred that the screen has center alignment for the page slide content and bottom-aligned page controls.
* **Component Padding**: Inferred to use standard modern paddings (`horizontal: 24`, `vertical: 32`) for page view and buttons.
* **Logo Box Sizing**: Logo icon box is sized to `100x100` with a border radius of `28` containing the stylized letter "P", representing a faithful fallback style if the logo PNG cannot render.
* **Slide Animations**: Inferred page transition animations using `PageView` controller: duration of `300ms` with `Curves.easeIn`.
* **Dots Indicators**: Inferred indicators as a row of circular/rounded containers (width: `8` for inactive, `16` for active, height: `8`) color-tinted with Primary Violet (`0xFF6B4EFF`) and Light Grey (`0xFFEBE8E1`).
* **Skip Option**: No explicit skip button logic was verified in the AOT binary symbols, so a basic slide flow with "Next" / "Get Started" buttons is implemented.

## Stage 2: Habits Screen & Calendar Tasks
* **Horizontal Calendar Range**: Inferred a 14-day window centered on the current date (6 days in the past, today, and 7 days in the future) for convenient horizontal scroll navigation.
* **Selected Date Indicator**: Selected date pills are highlighted using Primary Violet (`0xFF6B4EFF`) background with white text, and unselected pills have border outlines (`0xFFEBE8E1`) with secondary dark text.
* **Tab Selection**: Integrated a two-tab view structure with a TabBar controller ('Daily Habits' and 'Calendar Tasks').
* **Task Card Border Styling**: Task cards are styled with simple white rounded containers, outer grey borders (`0xFFEBE8E1`), and inner icon checkbox toggles.

## Stage 3: Study Screen & Pomodoro Timer
* **Circular Timer Dimensions**: Circular ring is sized to `240x240` with a border width of `6` using Primary Violet (`0xFF6B4EFF`) outline.
* **Start and Stop Button Sizing**: Stop button is styled as an orange (`0xFFE07A5F`) circle of size `64x64`, and Play/Pause button is styled as a teal (`0xFF00BFA5`) circle of size `72x72`.
* **Analytics Cards Layout**: Analytics cards present subject labels and calculated focus times (formatted dynamically in minutes) inside custom white rounded cards with grey borders (`0xFFEBE8E1`).

## Stage 4: SUS Usability Survey
* **Radio Options Layout**: Rating selectors are built as circular icons centered on a horizontal bar representing values 1 to 5.
* **Past Submissions Cards**: Inferred layout cards listing historic surveys showing dates/times along with the calculated usability score.
