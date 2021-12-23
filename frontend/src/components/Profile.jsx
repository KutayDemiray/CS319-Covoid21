import React from "react";
import '../sass/Profile.scss';
import panmanhead from "../images/panman-head.png";
function Profile() {
    return (
        <div className="profile">
            <div className="profile-container">
                    <div className="profile-brief">
                        <h1>My Profile</h1>
                        <img src={panmanhead} className="profile-brief-pp" alt="pp" />
                        <div className="profile-brief-info">
                            <h5>Alexandre Chancourtois</h5>
                            <h5>Student</h5>
                            <h5>S2P7-1923-09</h5>
                            <h5>83801666</h5>
                        </div>
                    </div>
                    <div className="profile-info">
                        <h1>My Data</h1>
                        <div className="dormmate">
                            <h3>Dormmates</h3>
                            <h5>•Elon Musk</h5>
                            <h5>•Nicola Tesla</h5>
                        </div>
                        <div className="deskmate">
                            <h3>Deskmates</h3>
                            <h5>•Eckstein</h5>
                            <h5>•Einstein</h5>
                        </div>
                        <div className="status">
                            <h3>Status</h3>
                            <h5>•Elon Musk</h5>
                            <h5>•Nicola Tesla</h5>
                        </div>
                        <div className="results">
                            <h3>Past Test Results</h3>
                            <h5>•31/02/2023 - (Negative)</h5>
                            <h5>•31/12/2022 - (Positive)</h5>
                        </div>
                    </div>
            </div>
        </div>
    );
}

export default Profile;