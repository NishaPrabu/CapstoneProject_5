Feature: WordPress Site Navigation

  Scenario: Verify navigation and search in WordPress site
    Given I launch the WordPress homepage
    Then I verify the page title is "Blog Tool, Publishing Platform, and CMS – WordPress.org"
    When I click on Get WordPress
    Then I verify the middle page text is "Get WordPress"
    When I click on "Community" and then "Photo Directory"
    And I search for picture named "sunset"
    Then I verify pictures are displayed
