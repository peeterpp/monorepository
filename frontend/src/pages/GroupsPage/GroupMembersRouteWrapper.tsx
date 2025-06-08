import React, { useEffect, useState } from "react";
import { useParams, useNavigate } from "react-router-dom";
import GroupMembersPage from "./GroupMembersPage";
import { groupsApi } from "../../api/groupsApi";
import type { Group } from "./GroupMembersPage";

const GroupMembersRouteWrapper: React.FC = () => {
    const { groupId } = useParams();
    const navigate = useNavigate();
    const [group, setGroup] = useState<Group | null>(null);

    useEffect(() => {
        const fetchGroup = async () => {
            if (!groupId) return;
            try {
                const data = await groupsApi.getGroupById(Number(groupId));
                setGroup(data);
            } catch (error) {
                console.error("Błąd pobierania grupy:", error);
            }
        };
        fetchGroup();
    }, [groupId]);

    if (!group) return <div>Ładowanie grupy...</div>;

    return <GroupMembersPage group={group} onBack={() => navigate("/groups")} />;
};

export default GroupMembersRouteWrapper;
