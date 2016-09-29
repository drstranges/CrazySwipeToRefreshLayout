# CrazySwipeToRefreshLayout
Crazy bug with replacing fragments in case of SwipeRefreshLayout is refreshing and is root of layout.

If we replace the current flagment which showing the loading progress of SwipeRefreshLayout (only if SwipeRefreshLayout is root layout), this fragment will not be removed (visually). Howiver, all lifecicle callback like onPause, onStop, onDestroyView, onDestroy is called as expected.

## Steps to reproduce the issue with the app
  - Launch the application
  - Click on Replace fragment. The second fragment is displayed (with SwipeRefreshLayout as root).
  - Swipe down to enable the refresh animation and let it run.
  - Click on Replace frament. The second fragment is still displayed. Note that the Inspector layout will show the first fragment int the hierarchy.
  - If you do the same thing with the First fragment  (with SwipeRefreshLayout wrapped in a FrameLayout), the fragment will be replaced as expected.

It was tested for appcompat v22 and for v23.4.0 it still there.
appcompat v24.2.1 - not fixed yet.
